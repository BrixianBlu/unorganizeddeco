package net.brixian.unorganizeddeco.data;

import net.brixian.unorganizeddeco.registry.UDecoBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;

public class UDModelData extends FabricModelProvider {
    public UDModelData(FabricPackOutput output) {super(output);}

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.family(UDecoBlocks.POLISHED_STONE)
                .stairs(UDecoBlocks.POLISHED_STONE_STAIRS)
                .slab(UDecoBlocks.POLISHED_STONE_SLAB)
                .wall(UDecoBlocks.POLISHED_STONE_WALL);
        blockModelGenerators.family(UDecoBlocks.STONE_TILES)
                .stairs(UDecoBlocks.STONE_TILES_STAIR)
                .slab(UDecoBlocks.STONE_TILES_SLAB)
                .wall(UDecoBlocks.STONE_TILES_WALL);


    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {

    }
}
