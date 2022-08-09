package net.dancervlt69.slabsnstairs.Init.Loot;
/*
import com.google.gson.JsonObject;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.dancervlt69.slabsnstairs.SlabsNstairs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.Serializer;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class CitrineCoinInDesertChestsAdditionModifier extends LootModifier {
    private final Item addition;
    protected CitrineCoinInDesertChestsAdditionModifier(LootItemCondition[] conditionsIn, Item addition) {
        super(conditionsIn);
        this.addition = addition;
    }
    @Nonnull
    @Override
    protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        if (context.getRandom().nextFloat() > 0.5F) {
            generatedLoot.add(new ItemStack(addition, 2));
        }
        return generatedLoot;
    }

    public static class Serializer extends GlobalLootModifierSerializer<CitrineCoinInDesertChestsAdditionModifier> {
        @Override
        public CitrineCoinInDesertChestsAdditionModifier read(ResourceLocation name, JsonObject object,
                                                               LootItemCondition[] conditionsIn) {
            Item addition = ForgeRegistries.ITEMS.getValue(
                    new ResourceLocation(GsonHelper.getAsString(object, "addition")));
            return new CitrineCoinInDesertChestsAdditionModifier(conditionsIn, addition);
        }
        @Override
        public JsonObject write(CitrineCoinInDesertChestsAdditionModifier instance) {
            JsonObject json = makeConditions(instance.conditions);
            json.addProperty("addition", ForgeRegistries.ITEMS.getKey(instance.addition).toString());
            return json;
        }
    }
}
*/
