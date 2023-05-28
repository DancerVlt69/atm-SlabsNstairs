package net.dancervlt69.slabsnstairs.init.utils.enchantments;

import net.dancervlt69.slabsnstairs.init.utils.enchantments.cutom.FreezingArrowsEnchantment;
import net.dancervlt69.slabsnstairs.init.utils.enchantments.cutom.LightningStrikerEnchant;
import net.dancervlt69.slabsnstairs.init.utils.enchantments.cutom.StrongMasterEnchantment;
import net.dancervlt69.slabsnstairs.SlabsNstairs;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEnchantments {

    public static final DeferredRegister<Enchantment> ENCHANTMENTS =
            DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, SlabsNstairs.MODID);

    public  static RegistryObject<Enchantment> LIGHTNING_STRIKER = ENCHANTMENTS.register("lightning_striker",
            () -> new LightningStrikerEnchant(Enchantment.Rarity.UNCOMMON,
                    EnchantmentCategory.CROSSBOW, EquipmentSlot.MAINHAND));

    public static RegistryObject<Enchantment> FREEZING_ARROWS = ENCHANTMENTS.register("freezing_arrows",
            () -> new FreezingArrowsEnchantment(Enchantment.Rarity.UNCOMMON, EquipmentSlot.MAINHAND));

    public static RegistryObject<Enchantment> STRONG_MASTER = ENCHANTMENTS.register("strong_master",
            () -> new StrongMasterEnchantment(Enchantment.Rarity.UNCOMMON, EquipmentSlot.MAINHAND));

    public static void register(IEventBus eventBus) {
        ENCHANTMENTS.register(eventBus);
    };
}