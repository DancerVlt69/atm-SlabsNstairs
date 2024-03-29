package net.dancervlt69.slabsnstairs.events.loot;

import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.dancervlt69.slabsnstairs.init.utils.settings.ModCommonConfig;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.Random;
import java.util.function.Supplier;

public class BerriesFromTallGrass extends LootModifier {
     public static final Supplier<Codec<BerriesFromTallGrass>> CODEC = Suppliers.memoize(
            () -> RecordCodecBuilder.create(inst -> codecStart(inst).and(ForgeRegistries.ITEMS.getCodec()
                    .fieldOf("item").forGetter(m -> m.item))
                    .apply(inst, BerriesFromTallGrass::new)));

    private final Item item;

    protected BerriesFromTallGrass(LootItemCondition[] conditionsIn, Item item) {
        super(conditionsIn);
        this.item = item;
    }

    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        if (ModCommonConfig.TALL_GRASS_LOOT_ACTIVATED.get()) {
            if (context.getRandom().nextFloat() > 0.965F) {
                generatedLoot.add(new ItemStack(item, (new Random().nextInt(2)) + 1));
            }
            return generatedLoot;
        }
        return generatedLoot ;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return CODEC.get();
    }

}
