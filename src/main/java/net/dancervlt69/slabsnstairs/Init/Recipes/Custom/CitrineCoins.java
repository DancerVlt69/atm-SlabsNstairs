package net.dancervlt69.slabsnstairs.Init.Recipes.Custom;


public class CitrineCoins {

}

/*
public class Blaze implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        if (e.getWhoClicked() instanceof Player) {
            if (e.getView().getType() == InventoryType.ANVIL) {
                AnvilInventory anvilInv = (AnvilInventory) e.getInventory();
                int slot = e.getRawSlot();

                if (slot == 2) {
                    ItemStack[] itemsInAnvil = anvilInv.getContents();
                    Material[] swords = {Material.WOOD_SWORD, Material.STONE_SWORD, Material.GOLD_SWORD, Material.IRON_SWORD, Material.DIAMOND_SWORD, Material.BLAZE_POWDER};

                    for (Material m : swords) {
                        if (itemsInAnvil[0].getType() == m && itemsInAnvil[1].getType() == m) {
                            ItemStack slot1 = itemsInAnvil[0];
                            ItemStack slot2 = itemsInAnvil[1];

                            if (slot1.getEnchantmentLevel(Enchantment.FIRE_ASPECT) == 1 && slot2.getEnchantmentLevel(Enchantment.FIRE_ASPECT) == 1) {
                                ItemStack sword = new ItemStack(m, 1);
                                sword.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 2);
                                e.setCurrentItem(sword);
                            }
                        }
                    }
                }
            }
        }
    }
}
*/
