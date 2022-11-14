package net.dancervlt69.slabsnstairs.Init.Events.Loot;

import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.Random;

public class BonesFromSheepWhite extends LootModifier {
    private final Item item;

    protected BonesFromSheepWhite(LootItemCondition[] conditionsIn, Item item) {
        super(conditionsIn);
        this.item = item;
    }

    @Nonnull
    @Override
    protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
        if(context.getRandom().nextFloat() > 0.625F) {
            generatedLoot.add(new ItemStack(item, (new Random().nextInt(2))+1));
        }
        return generatedLoot;
    }
    public static class Serializer extends GlobalLootModifierSerializer<BonesFromSheepWhite> {
        @Override
        public BonesFromSheepWhite read(ResourceLocation name, JsonObject object,
										LootItemCondition[] conditionIn) {
            Item item = ForgeRegistries.ITEMS.getValue(
                    new ResourceLocation(GsonHelper.getAsString(object, "item")));
            return new BonesFromSheepWhite(conditionIn, item);
        }
        @Override
        public JsonObject write(BonesFromSheepWhite instance) {
            JsonObject json = makeConditions(instance.conditions);
            json.addProperty("item", ForgeRegistries.ITEMS.getKey(instance.item).toString());
            return json;
        }
    }

}
