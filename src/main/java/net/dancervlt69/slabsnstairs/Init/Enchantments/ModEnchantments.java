package net.dancervlt69.slabsnstairs.Init.Enchantments;

import net.dancervlt69.slabsnstairs.Init.Enchantments.Cutom.LightningStrikerEnchant;
import net.dancervlt69.slabsnstairs.Init.Enchantments.Cutom.StrongMasterEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static net.dancervlt69.slabsnstairs.SlabsNstairs.MODID;

public class ModEnchantments {

    public static final DeferredRegister<Enchantment> ENCHANTMENTS =
            DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, MODID);

    public static RegistryObject<Enchantment> LIGHTNING_STRIKER = ENCHANTMENTS.register("lightning_striker",
            () -> new LightningStrikerEnchant(Enchantment.Rarity.UNCOMMON,
                    EnchantmentType.CROSSBOW, new EquipmentSlotType[]{EquipmentSlotType.MAINHAND}));

    public static RegistryObject<Enchantment> STRONG_MASTER = ENCHANTMENTS.register("strong_master",
            () -> new StrongMasterEnchantment(Enchantment.Rarity.UNCOMMON,
                   new EquipmentSlotType[]{EquipmentSlotType.MAINHAND}));

    public static void register(IEventBus eventBus) {
        ENCHANTMENTS.register(eventBus);
    };
}
