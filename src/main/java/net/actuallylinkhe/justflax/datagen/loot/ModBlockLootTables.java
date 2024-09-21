package net.actuallylinkhe.justflax.datagen.loot;

import net.actuallylinkhe.justflax.item.ModItems;
import net.actuallylinkhe.justflax.block.ModBlocks;
import net.actuallylinkhe.justflax.block.custom.FlaxCropBlock;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.predicates.*;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        LootItemCondition.Builder lootitemcondition$builder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.FLAX_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(FlaxCropBlock.AGE, 3));

        this.add(ModBlocks.FLAX_CROP.get(), createCropDrops(ModBlocks.FLAX_CROP.get(), ModItems.FLAX.get(),
                ModItems.FLAX_SEEDS.get(), lootitemcondition$builder));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
