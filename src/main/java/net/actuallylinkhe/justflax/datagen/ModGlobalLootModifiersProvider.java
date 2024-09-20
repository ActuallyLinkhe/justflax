package net.actuallylinkhe.justflax.datagen;

import net.actuallylinkhe.justflax.JustFlax;
import net.actuallylinkhe.justflax.item.ModItems;
import net.actuallylinkhe.justflax.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, JustFlax.MOD_ID);
    }

    @Override
    protected void start() {
        add("flax_seeds_from_grass", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(),
                LootItemRandomChanceCondition.randomChance(0.25f).build()}, ModItems.FLAX_SEEDS.get()));


    }
}