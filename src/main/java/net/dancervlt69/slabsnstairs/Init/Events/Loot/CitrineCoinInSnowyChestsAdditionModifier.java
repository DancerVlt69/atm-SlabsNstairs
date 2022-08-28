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

public class CitrineCoinInSnowyChestsAdditionModifier extends LootModifier {

    private final Item addition;
    protected CitrineCoinInSnowyChestsAdditionModifier(ILootCondition[] conditionsIn, Item addition) {
        super(conditionsIn);
        this.addition = addition;
    }
    @Nonnull
    @Override
    protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
        if(context.getRandom().nextFloat() > 0.5F) {
            generatedLoot.add(new ItemStack(addition, 2));
        }
        return generatedLoot;
    }
    public static class Serializer extends GlobalLootModifierSerializer<CitrineCoinInSnowyChestsAdditionModifier> {
        @Override
        public CitrineCoinInSnowyChestsAdditionModifier read(ResourceLocation name, JsonObject object,
                                                             ILootCondition[] conditionIn) {
            Item addition = ForgeRegistries.ITEMS.getValue(
                    new ResourceLocation(JSONUtils.getAsString(object, "addition")));
            return new CitrineCoinInSnowyChestsAdditionModifier(conditionIn, addition);
        }
        @Override
        public JsonObject write(CitrineCoinInSnowyChestsAdditionModifier instance) {
            JsonObject json = makeConditions(instance.conditions);
            json.addProperty("addition", ForgeRegistries.ITEMS.getKey(instance.addition).toString());
            return json;
        }
    }
}

