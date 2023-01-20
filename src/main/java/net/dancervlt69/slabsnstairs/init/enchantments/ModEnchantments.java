package net.dancervlt69.slabsnstairs.init.enchantments;

import net.dancervlt69.slabsnstairs.init.enchantments.utils.FreezingArrowsEnchantment;
import net.dancervlt69.slabsnstairs.init.enchantments.utils.LightningStrikerEnchantment;
import net.dancervlt69.slabsnstairs.init.enchantments.utils.StrongMasterEnchantment;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

public class ModEnchantments {

    public static final DeferredRegister<Enchantment> ENCHANTMENTS =
            DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, MODID);

    public  static RegistryObject<Enchantment> LIGHTNING_STRIKER = ENCHANTMENTS.register("lightning_striker",
            () -> new LightningStrikerEnchantment(Enchantment.Rarity.UNCOMMON,
                    EnchantmentCategory.BOW, EquipmentSlot.MAINHAND));

    public static RegistryObject<Enchantment> FREEZING_ARROWS = ENCHANTMENTS.register("freezing_arrows",
            () -> new FreezingArrowsEnchantment(Enchantment.Rarity.UNCOMMON, EquipmentSlot.MAINHAND));

    public static RegistryObject<Enchantment> STRONG_MASTER = ENCHANTMENTS.register("strong_master",
            () -> new StrongMasterEnchantment(Enchantment.Rarity.UNCOMMON, EquipmentSlot.MAINHAND));

    public static void register(IEventBus eventBus) {
        ENCHANTMENTS.register(eventBus);
    };
}
