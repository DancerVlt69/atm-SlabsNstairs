package net.dancervlt69.slabsnstairs.Init.Events.Loot;

import com.google.gson.JsonObject;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.Random;

public class BonesFromFox extends LootModifier {
    private final Item item;

    protected BonesFromFox(ILootCondition[] conditionsIn, Item item) {
        super(conditionsIn);
        this.item = item;
    }

    @Nonnull
    @Override
    protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
        if(context.getRandom().nextFloat() > 0.625F) {
            generatedLoot.add(new ItemStack(item, (new Random().nextInt(1))+1));
        }
        return generatedLoot;
    }

    public static class Serializer extends GlobalLootModifierSerializer<BonesFromFox> {
        @Override
        public BonesFromFox read(ResourceLocation name, JsonObject object, ILootCondition[] conditionIn) {
            Item item = ForgeRegistries.ITEMS.getValue(
                    new ResourceLocation(JSONUtils.getAsString(object, "item")));
            return new BonesFromFox(conditionIn, item);
        }
        @Override
        public JsonObject write(BonesFromFox instance) {
            JsonObject json = makeConditions(instance.conditions);
            json.addProperty("item", ForgeRegistries.ITEMS.getKey(instance.item).toString());
            return json;
        }
    }

    public int getRandomAmount (int min , int max) {
        Random pRandom = new Random();
        return pRandom.nextInt(max - min) + min;
    }
}
