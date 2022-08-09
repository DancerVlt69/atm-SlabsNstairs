package net.dancervlt69.slabsnstairs.Init.datagen.providers;

import net.dancervlt69.slabsnstairs.Init.Loot.ModLootAdditionModifier;
import net.dancervlt69.slabsnstairs.SlabsNstairs;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

/**
 * Author: Autovw
 */


public class ModLootModifierProvider extends GlobalLootModifierProvider {
    public ModLootModifierProvider(DataGenerator gen) {
        super(gen, SlabsNstairs.MODID);
    }

    @Override
    protected void start() {
        // add("loot_addition_modifier", new ModLootAdditionModifier(new LootItemCondition[] {}));
        add("citrine_coin_in_desert_chests", new ModLootAdditionModifier(new LootItemCondition[] {}));
        // add("citrine_coin_in_plains_chests", new ModLootAdditionModifier(new LootItemCondition[] {}));
        // add("citrine_coin_in_snowy_chests", new ModLootAdditionModifier(new LootItemCondition[] {}));
    }

}
