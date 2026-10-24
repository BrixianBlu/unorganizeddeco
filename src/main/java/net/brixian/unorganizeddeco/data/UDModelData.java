package net.brixian.unorganizeddeco.data;

import net.brixian.unorganizeddeco.registry.UDecoBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.world.level.block.Blocks;

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
        blockModelGenerators.family(Blocks.POLISHED_GRANITE)
                .wall(UDecoBlocks.POLISHED_GRANITE_WALL);
        blockModelGenerators.family(UDecoBlocks.GRANITE_BRICKS)
                .stairs(UDecoBlocks.GRANITE_BRICK_STAIRS)
                .slab(UDecoBlocks.GRANITE_BRICK_SLAB)
                .wall(UDecoBlocks.GRANITE_BRICK_WALL);
        blockModelGenerators.family(UDecoBlocks.GRANITE_TILES)
                .stairs(UDecoBlocks.GRANITE_TILES_STAIRS)
                .slab(UDecoBlocks.GRANITE_TILES_SLAB)
                .wall(UDecoBlocks.GRANITE_TILES_WALL);
        blockModelGenerators.family(Blocks.POLISHED_DIORITE)
                .wall(UDecoBlocks.POLISHED_DIORITE_WALL);
        blockModelGenerators.family(UDecoBlocks.DIORITE_BRICKS)
                .stairs(UDecoBlocks.DIORITE_BRICK_STAIRS)
                .slab(UDecoBlocks.DIORITE_BRICK_SLAB)
                .wall(UDecoBlocks.DIORITE_BRICK_WALL);
        blockModelGenerators.family(UDecoBlocks.DIORITE_TILES)
                .stairs(UDecoBlocks.DIORITE_TILES_STAIRS)
                .slab(UDecoBlocks.DIORITE_TILES_SLAB)
                .wall(UDecoBlocks.DIORITE_TILES_WALL);
        blockModelGenerators.family(Blocks.POLISHED_ANDESITE)
                .wall(UDecoBlocks.POLISHED_ANDESITE_WALL);
        blockModelGenerators.family(UDecoBlocks.ANDESITE_BRICKS)
                .stairs(UDecoBlocks.ANDESITE_BRICK_STAIRS)
                .slab(UDecoBlocks.ANDESITE_BRICK_SLAB)
                .wall(UDecoBlocks.ANDESITE_BRICK_WALL);
        blockModelGenerators.family(UDecoBlocks.ANDESITE_TILES)
                .stairs(UDecoBlocks.ANDESITE_TILES_STAIRS)
                .slab(UDecoBlocks.ANDESITE_TILES_SLAB)
                .wall(UDecoBlocks.ANDESITE_TILES_WALL);
        blockModelGenerators.family(UDecoBlocks.TUFF_TILES)
                .stairs(UDecoBlocks.TUFF_TILES_STAIRS)
                .slab(UDecoBlocks.TUFF_TILES_SLAB)
                .wall(UDecoBlocks.TUFF_TILES_WALL);
        blockModelGenerators.family(Blocks.NETHERRACK)
                .stairs(UDecoBlocks.NETHERRACK_STAIRS)
                .slab(UDecoBlocks.NETHERRACK_SLAB)
                .wall(UDecoBlocks.NETHERRACK_WALL);
        blockModelGenerators.family(UDecoBlocks.POLISHED_NETHERRACK)
                .stairs(UDecoBlocks.POLISHED_NETHERRACK_STAIRS)
                .slab(UDecoBlocks.POLISHED_NETHERRACK_SLAB)
                .wall(UDecoBlocks.POLISHED_NETHERRACK_WALL);
        blockModelGenerators.family(UDecoBlocks.NETHERRACK_BRICKS)
                .stairs(UDecoBlocks.NETHERRACK_BRICK_STAIRS)
                .slab(UDecoBlocks.NETHERRACK_BRICK_SLAB)
                .wall(UDecoBlocks.NETHERRACK_BRICK_WALL);
        blockModelGenerators.family(UDecoBlocks.NETHERRACK_TILES)
                .stairs(UDecoBlocks.NETHERRACK_TILES_STAIRS)
                .slab(UDecoBlocks.NETHERRACK_TILES_SLAB)
                .wall(UDecoBlocks.NETHERRACK_TILES_WALL);
        blockModelGenerators.family(Blocks.CALCITE)
                .stairs(UDecoBlocks.CALCITE_STAIRS)
                .slab(UDecoBlocks.CALCITE_SLAB)
                .wall(UDecoBlocks.CALCITE_WALL);
        blockModelGenerators.family(UDecoBlocks.POLISHED_CALCITE)
                .stairs(UDecoBlocks.POLISHED_CALCITE_STAIRS)
                .slab(UDecoBlocks.POLISHED_CALCITE_SLAB)
                .wall(UDecoBlocks.POLISHED_CALCITE_WALL);
        blockModelGenerators.family(UDecoBlocks.CALCITE_BRICKS)
                .stairs(UDecoBlocks.CALCITE_BRICK_STAIRS)
                .slab(UDecoBlocks.CALCITE_BRICK_SLAB)
                .wall(UDecoBlocks.CALCITE_BRICK_WALL);
        blockModelGenerators.family(UDecoBlocks.CALCITE_TILES)
                .stairs(UDecoBlocks.CALCITE_TILES_STAIRS)
                .slab(UDecoBlocks.CALCITE_TILES_SLAB)
                .wall(UDecoBlocks.CALCITE_TILES_WALL);
        blockModelGenerators.family(UDecoBlocks.BLACKSTONE_TILES)
                .stairs(UDecoBlocks.BLACKSTONE_TILES_STAIRS)
                .slab(UDecoBlocks.BLACKSTONE_TILES_SLAB)
                .wall(UDecoBlocks.BLACKSTONE_TILES_WALL);
        blockModelGenerators.family(Blocks.SMOOTH_BASALT)
                .stairs(UDecoBlocks.SMOOTH_BASALT_STAIRS)
                .slab(UDecoBlocks.SMOOTH_BASALT_SLAB);
        blockModelGenerators.family(UDecoBlocks.BASALT_BRICKS)
                .stairs(UDecoBlocks.BASALT_BRICK_STAIRS)
                .slab(UDecoBlocks.BASALT_BRICK_SLAB)
                .wall(UDecoBlocks.BASALT_BRICK_WALL);
        blockModelGenerators.family(UDecoBlocks.BASALT_TILES)
                .stairs(UDecoBlocks.BASALT_TILES_STAIRS)
                .slab(UDecoBlocks.BASALT_TILES_SLAB)
                .wall(UDecoBlocks.BASALT_TILES_WALL);
        blockModelGenerators.family(Blocks.END_STONE)
                .stairs(UDecoBlocks.END_STONE_STAIRS)
                .slab(UDecoBlocks.END_STONE_SLAB)
                .wall(UDecoBlocks.END_STONE_WALL);
        blockModelGenerators.family(UDecoBlocks.POLISHED_END_STONE)
                .stairs(UDecoBlocks.POLISHED_END_STONE_STAIRS)
                .slab(UDecoBlocks.POLISHED_END_STONE_SLAB)
                .wall(UDecoBlocks.POLISHED_END_STONE_WALL);
        blockModelGenerators.family(UDecoBlocks.END_STONE_TILES)
                .stairs(UDecoBlocks.END_STONE_TILES_STAIRS)
                .slab(UDecoBlocks.END_STONE_TILES_SLAB)
                .wall(UDecoBlocks.END_STONE_TILES_WALL);
        blockModelGenerators.family(Blocks.PRISMARINE_BRICKS)
                .wall(UDecoBlocks.PRISMARINE_BRICK_WALL);
        blockModelGenerators.family(UDecoBlocks.POLISHED_PRISMARINE)
                .stairs(UDecoBlocks.POLISHED_PRISMARINE_STAIRS)
                .slab(UDecoBlocks.POLISHED_PRISMARINE_SLAB)
                .wall(UDecoBlocks.POLISHED_PRISMARINE_WALL);
        blockModelGenerators.family(UDecoBlocks.PRISMARINE_TILES)
                .stairs(UDecoBlocks.PRISMARINE_TILES_STAIRS)
                .slab(UDecoBlocks.PRISMARINE_TILES_SLAB)
                .wall(UDecoBlocks.PRISMARINE_TILES_WALL);
        blockModelGenerators.family(Blocks.LAPIS_BLOCK)
                .stairs(UDecoBlocks.LAPIS_STAIRS)
                .slab(UDecoBlocks.LAPIS_SLAB);
        blockModelGenerators.family(UDecoBlocks.SMOOTH_LAPIS)
                .stairs(UDecoBlocks.SMOOTH_LAPIS_STAIRS)
                .slab(UDecoBlocks.SMOOTH_LAPIS_SLAB);
        blockModelGenerators.family(UDecoBlocks.LAPIS_BRICKS)
                .stairs(UDecoBlocks.LAPIS_BRICK_STAIRS)
                .slab(UDecoBlocks.LAPIS_BRICK_SLAB)
                .wall(UDecoBlocks.LAPIS_BRICK_WALL);
        blockModelGenerators.family(UDecoBlocks.LAPIS_TILES)
                .stairs(UDecoBlocks.LAPIS_TILES_STAIRS)
                .slab(UDecoBlocks.LAPIS_TILES_SLAB)
                .wall(UDecoBlocks.LAPIS_TILES_WALL);
        blockModelGenerators.family(Blocks.QUARTZ_BRICKS)
                .stairs(UDecoBlocks.QUARTZ_BRICK_STAIRS)
                .slab(UDecoBlocks.QUARTZ_BRICK_SLAB)
                .wall(UDecoBlocks.QUARTZ_BRICK_WALL);
        blockModelGenerators.family(UDecoBlocks.QUARTZ_TILES)
                .stairs(UDecoBlocks.QUARTZ_TILES_STAIRS)
                .slab(UDecoBlocks.QUARTZ_TILES_SLAB)
                .wall(UDecoBlocks.QUARTZ_TILES_WALL);
        blockModelGenerators.family(UDecoBlocks.SULFUR_TILES)
                .stairs(UDecoBlocks.SULFUR_TILES_STAIRS)
                .slab(UDecoBlocks.SULFUR_TILES_SLAB)
                .wall(UDecoBlocks.SULFUR_TILES_WALL);
        blockModelGenerators.family(UDecoBlocks.CINNABAR_TILES)
                .stairs(UDecoBlocks.CINNABAR_TILES_STAIRS)
                .slab(UDecoBlocks.CINNABAR_TILES_SLAB)
                .wall(UDecoBlocks.CINNABAR_TILES_WALL);
        blockModelGenerators.family(UDecoBlocks.WHITE_BRICKS)
                .stairs(UDecoBlocks.WHITE_BRICK_STAIRS)
                .slab(UDecoBlocks.WHITE_BRICK_SLAB)
                .wall(UDecoBlocks.WHITE_BRICK_WALL);
        blockModelGenerators.family(UDecoBlocks.LIGHT_GRAY_BRICKS)
                .stairs(UDecoBlocks.LIGHT_GRAY_BRICK_STAIRS)
                .slab(UDecoBlocks.LIGHT_GRAY_BRICK_SLAB)
                .wall(UDecoBlocks.LIGHT_GRAY_BRICK_WALL);
        blockModelGenerators.family(UDecoBlocks.GRAY_BRICKS)
                .stairs(UDecoBlocks.GRAY_BRICK_STAIRS)
                .slab(UDecoBlocks.GRAY_BRICK_SLAB)
                .wall(UDecoBlocks.GRAY_BRICK_WALL);
        blockModelGenerators.family(UDecoBlocks.BLACK_BRICKS)
                .stairs(UDecoBlocks.BLACK_BRICK_STAIRS)
                .slab(UDecoBlocks.BLACK_BRICK_SLAB)
                .wall(UDecoBlocks.BLACK_BRICK_WALL);
        blockModelGenerators.family(UDecoBlocks.RED_BRICKS)
                .stairs(UDecoBlocks.RED_BRICK_STAIRS)
                .slab(UDecoBlocks.RED_BRICK_SLAB)
                .wall(UDecoBlocks.RED_BRICK_WALL);

        blockModelGenerators.family(UDecoBlocks.ORANGE_BRICKS)
                .stairs(UDecoBlocks.ORANGE_BRICK_STAIRS)
                .slab(UDecoBlocks.ORANGE_BRICK_SLAB)
                .wall(UDecoBlocks.ORANGE_BRICK_WALL);

        blockModelGenerators.family(UDecoBlocks.YELLOW_BRICKS)
                .stairs(UDecoBlocks.YELLOW_BRICK_STAIRS)
                .slab(UDecoBlocks.YELLOW_BRICK_SLAB)
                .wall(UDecoBlocks.YELLOW_BRICK_WALL);

        blockModelGenerators.family(UDecoBlocks.LIME_BRICKS)
                .stairs(UDecoBlocks.LIME_BRICK_STAIRS)
                .slab(UDecoBlocks.LIME_BRICK_SLAB)
                .wall(UDecoBlocks.LIME_BRICK_WALL);

        blockModelGenerators.family(UDecoBlocks.GREEN_BRICKS)
                .stairs(UDecoBlocks.GREEN_BRICK_STAIRS)
                .slab(UDecoBlocks.GREEN_BRICK_SLAB)
                .wall(UDecoBlocks.GREEN_BRICK_WALL);

        blockModelGenerators.family(UDecoBlocks.LIGHT_BLUE_BRICKS)
                .stairs(UDecoBlocks.LIGHT_BLUE_BRICK_STAIRS)
                .slab(UDecoBlocks.LIGHT_BLUE_BRICK_SLAB)
                .wall(UDecoBlocks.LIGHT_BLUE_BRICK_WALL);

        blockModelGenerators.family(UDecoBlocks.BLUE_BRICKS)
                .stairs(UDecoBlocks.BLUE_BRICK_STAIRS)
                .slab(UDecoBlocks.BLUE_BRICK_SLAB)
                .wall(UDecoBlocks.BLUE_BRICK_WALL);

        blockModelGenerators.family(UDecoBlocks.CYAN_BRICKS)
                .stairs(UDecoBlocks.CYAN_BRICK_STAIRS)
                .slab(UDecoBlocks.CYAN_BRICK_SLAB)
                .wall(UDecoBlocks.CYAN_BRICK_WALL);

        blockModelGenerators.family(UDecoBlocks.PURPLE_BRICKS)
                .stairs(UDecoBlocks.PURPLE_BRICK_STAIRS)
                .slab(UDecoBlocks.PURPLE_BRICK_SLAB)
                .wall(UDecoBlocks.PURPLE_BRICK_WALL);

        blockModelGenerators.family(UDecoBlocks.MAGENTA_BRICKS)
                .stairs(UDecoBlocks.MAGENTA_BRICK_STAIRS)
                .slab(UDecoBlocks.MAGENTA_BRICK_SLAB)
                .wall(UDecoBlocks.MAGENTA_BRICK_WALL);

        blockModelGenerators.family(UDecoBlocks.PINK_BRICKS)
                .stairs(UDecoBlocks.PINK_BRICK_STAIRS)
                .slab(UDecoBlocks.PINK_BRICK_SLAB)
                .wall(UDecoBlocks.PINK_BRICK_WALL);

        blockModelGenerators.family(UDecoBlocks.BROWN_BRICKS)
                .stairs(UDecoBlocks.BROWN_BRICK_STAIRS)
                .slab(UDecoBlocks.BROWN_BRICK_SLAB)
                .wall(UDecoBlocks.BROWN_BRICK_WALL);

        blockModelGenerators.family(UDecoBlocks.MONOCHROME_BRICKS)
                .stairs(UDecoBlocks.MONOCHROME_BRICK_STAIRS)
                .slab(UDecoBlocks.MONOCHROME_BRICK_SLAB)
                .wall(UDecoBlocks.MONOCHROME_BRICK_WALL);

        blockModelGenerators.family(UDecoBlocks.WARM_BRICKS)
                .stairs(UDecoBlocks.WARM_BRICK_STAIRS)
                .slab(UDecoBlocks.WARM_BRICK_SLAB)
                .wall(UDecoBlocks.WARM_BRICK_WALL);

        blockModelGenerators.family(UDecoBlocks.COLD_BRICKS)
                .stairs(UDecoBlocks.COLD_BRICK_STAIRS)
                .slab(UDecoBlocks.COLD_BRICK_SLAB)
                .wall(UDecoBlocks.COLD_BRICK_WALL);

        blockModelGenerators.family(UDecoBlocks.SPRING_BRICKS)
                .stairs(UDecoBlocks.SPRING_BRICK_STAIRS)
                .slab(UDecoBlocks.SPRING_BRICK_SLAB)
                .wall(UDecoBlocks.SPRING_BRICK_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {

    }
}
