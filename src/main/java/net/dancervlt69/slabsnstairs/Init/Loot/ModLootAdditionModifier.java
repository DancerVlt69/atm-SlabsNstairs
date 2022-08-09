package net.dancervlt69.slabsnstairs.Init.Loot;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.dancervlt69.slabsnstairs.Init.Items.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.LootModifier;

import javax.annotation.Nullable;

public class ModLootAdditionModifier extends LootModifier {

    public static final Codec<ModLootAdditionModifier> CODEC = RecordCodecBuilder.create(instance -> codecStart(instance)
            .apply(instance, ModLootAdditionModifier::new));

    public ModLootAdditionModifier(LootItemCondition[] conditionsIn) {
        super(conditionsIn);
    }

    @Nullable
    @Override
    protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        ResourceLocation queriedTableId = context.getQueriedLootTableId();
        RandomSource random = context.getRandom();

        // if (Settings.LootConfig.generateChestloot.get()) {
        if (queriedTableId.equals(new ResourceLocation("chests/village/village_desert_house"))) {
            generatedLoot.add(new ItemStack(ModItems.CITRINE_COIN.get(), random.nextIntBetweenInclusive(0, 3)));
        }

        if (queriedTableId.equals(new ResourceLocation("chests/village/village_plains_house"))) {
            generatedLoot.add(new ItemStack(ModItems.CITRINE_COIN.get(), random.nextIntBetweenInclusive(0, 3)));
        }

        if (queriedTableId.equals(new ResourceLocation("chests/village/village_snowy_house"))) {
            generatedLoot.add(new ItemStack(ModItems.CITRINE_COIN.get(), random.nextIntBetweenInclusive(0, 3)));
        }
        return generatedLoot;
    }

    @Override
    public Codec<? extends ModLootAdditionModifier> codec() {
        return CODEC;
    }
}
