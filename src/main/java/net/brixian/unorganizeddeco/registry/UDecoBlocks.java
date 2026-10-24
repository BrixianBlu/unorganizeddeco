package net.brixian.unorganizeddeco.registry;

import net.brixian.unorganizeddeco.UnorganizedDeco;
import net.brixian.unorganizeddeco.block.BarrelBlock;
import net.brixian.unorganizeddeco.block.crop_blocks.AppleBlock;
import net.brixian.unorganizeddeco.block.crop_blocks.ChorusBlock;
import net.brixian.unorganizeddeco.block.crop_blocks.GoldenAppleBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Function;

public class UDecoBlocks {
    //Stone
    public static final Block STONE_PILLAR = registerBlock("stone_pillar", props -> new RotatedPillarBlock(props.strength(1.5F, 6.0F).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block POLISHED_STONE = registerBlock("polished_stone", props -> new Block(props.strength(1.5F, 6.0F).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));
     public static final Block POLISHED_STONE_STAIRS = registerBlock("polished_stone_stairs", props ->new StairBlock(UDecoBlocks.POLISHED_STONE.defaultBlockState(), props.strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
     public static final Block POLISHED_STONE_SLAB = registerBlock("polished_stone_slab", props -> new SlabBlock(props.strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
     public static final Block POLISHED_STONE_WALL = registerBlock("polished_stone_wall", props -> new WallBlock(props.strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final Block STONE_TILES = registerBlock("stone_tiles", props -> new Block(props.strength(1.5F, 6.0F).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));
     public static final Block STONE_TILES_STAIR = registerBlock("stone_tiles_stairs", props -> new StairBlock(UDecoBlocks.STONE_TILES.defaultBlockState(), props.strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
     public static final Block STONE_TILES_SLAB = registerBlock("stone_tiles_slab", props -> new SlabBlock(props.strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
     public static final Block STONE_TILES_WALL = registerBlock("stone_tiles_wall", props -> new WallBlock(props.strength(1.5F, 6.0F).requiresCorrectToolForDrops()));

     //Deepslate
    public static final Block DEEPSLATE_PILLAR = registerBlock("deepslate_pillar", props -> new RotatedPillarBlock(props.mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)));

    //Granite
    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks", props -> new Block(props.mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
     public static final Block GRANITE_BRICK_STAIRS = registerBlock("granite_brick_stairs", props -> new StairBlock(GRANITE_BRICKS.defaultBlockState(), props.mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
     public static final Block GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab", props -> new SlabBlock(props.mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
     public static final Block GRANITE_BRICK_WALL = registerBlock("granite_brick_wall", props -> new WallBlock(props.mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall", props -> new WallBlock(props.mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block GRANITE_PILLAR = registerBlock("granite_pillar", props -> new RotatedPillarBlock(props.mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CHISELED_GRANITE = registerBlock("chiseled_granite", props -> new Block(props.mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block GRANITE_TILES = registerBlock("granite_tiles", props -> new Block(props.mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
     public static final Block GRANITE_TILES_STAIRS = registerBlock("granite_tiles_stairs", props -> new StairBlock(GRANITE_TILES.defaultBlockState(), props.mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
     public static final Block GRANITE_TILES_SLAB = registerBlock("granite_tiles_slab", props -> new SlabBlock(props.mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
     public static final Block GRANITE_TILES_WALL = registerBlock("granite_tiles_wall", props -> new WallBlock(props.mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

    // Diorite
    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks", props -> new Block(props.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs", props -> new StairBlock(DIORITE_BRICKS.defaultBlockState(), props.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab", props -> new SlabBlock(props.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall", props -> new WallBlock(props.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall", props -> new WallBlock(props.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block DIORITE_PILLAR = registerBlock("diorite_pillar", props -> new RotatedPillarBlock(props.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CHISELED_DIORITE = registerBlock("chiseled_diorite", props -> new Block(props.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block DIORITE_TILES = registerBlock("diorite_tiles", props -> new Block(props.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block DIORITE_TILES_STAIRS = registerBlock("diorite_tiles_stairs", props -> new StairBlock(DIORITE_TILES.defaultBlockState(), props.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block DIORITE_TILES_SLAB = registerBlock("diorite_tiles_slab", props -> new SlabBlock(props.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block DIORITE_TILES_WALL = registerBlock("diorite_tiles_wall", props -> new WallBlock(props.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

    // Andesite
    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks", props -> new Block(props.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs", props -> new StairBlock(ANDESITE_BRICKS.defaultBlockState(), props.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab", props -> new SlabBlock(props.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall", props -> new WallBlock(props.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall", props -> new WallBlock(props.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block ANDESITE_PILLAR = registerBlock("andesite_pillar", props -> new RotatedPillarBlock(props.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CHISELED_ANDESITE = registerBlock("chiseled_andesite", props -> new Block(props.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block ANDESITE_TILES = registerBlock("andesite_tiles", props -> new Block(props.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block ANDESITE_TILES_STAIRS = registerBlock("andesiteiorite_tiles_stairs", props -> new StairBlock(ANDESITE_TILES.defaultBlockState(), props.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block ANDESITE_TILES_SLAB = registerBlock("andesite_tiles_slab", props -> new SlabBlock(props.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block ANDESITE_TILES_WALL = registerBlock("andesite_tiles_wall", props -> new WallBlock(props.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

    //Tuff
    public static final Block TUFF_PILLAR = registerBlock("tuff_pillar", props -> new RotatedPillarBlock(props.mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.TUFF).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block TUFF_TILES = registerBlock("tuff_tiles", props -> new Block(props.mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.TUFF).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
     public static final Block TUFF_TILES_STAIRS = registerBlock("tuff_tiles_stairs", props -> new StairBlock(TUFF_TILES.defaultBlockState(), props.mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.TUFF).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
     public static final Block TUFF_TILES_SLAB = registerBlock("tuff_tiles_slab", props -> new SlabBlock(props.mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.TUFF).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
     public static final Block TUFF_TILES_WALL = registerBlock("tuff_tiles_wall", props -> new WallBlock(props.mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.TUFF).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

    //Calcite
    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs", props -> new StairBlock(Blocks.CALCITE.defaultBlockState(), props.mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
    public static final Block CALCITE_SLAB = registerBlock("calcite_slab", props -> new SlabBlock(props.mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
    public static final Block CALCITE_WALL = registerBlock("calcite_wall", props -> new WallBlock(props.mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks", props -> new Block(props.mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
     public static final Block CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs", props -> new StairBlock(CALCITE_BRICKS.defaultBlockState(), props.mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
     public static final Block CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab", props -> new SlabBlock(props.mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
     public static final Block CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall", props -> new WallBlock(props.mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
    public static final Block POLISHED_CALCITE = registerBlock("polished_calcite", props -> new Block(props.mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
     public static final Block POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs", props -> new StairBlock(POLISHED_CALCITE.defaultBlockState(), props.mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
     public static final Block POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab", props -> new SlabBlock(props.mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
     public static final Block POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall", props -> new WallBlock(props.mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
    public static final Block CALCITE_PILLAR = registerBlock("calcite_pillar", props -> new RotatedPillarBlock(props.mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
    public static final Block CHISELED_CALCITE = registerBlock("chiseled_calcite", props -> new Block(props.mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
    public static final Block CALCITE_TILES = registerBlock("calcite_tiles", props -> new Block(props.mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
     public static final Block CALCITE_TILES_STAIRS = registerBlock("calcite_tiles_stairs", props -> new StairBlock(CALCITE_TILES.defaultBlockState(), props.mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
     public static final Block CALCITE_TILES_SLAB = registerBlock("calcite_tiles_slab", props -> new SlabBlock(props.mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
     public static final Block CALCITE_TILES_WALL = registerBlock("calcite_tiles_wall", props -> new WallBlock(props.mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));

    //Netherrack
    public static final Block NETHERRACK_STAIRS = registerBlock("netherrack_stairs", props -> new StairBlock(Blocks.NETHERRACK.defaultBlockState(), props.mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK)));
    public static final Block NETHERRACK_SLAB = registerBlock("netherrack_slab", props -> new SlabBlock(props.mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK)));
    public static final Block NETHERRACK_WALL = registerBlock("netherrack_wall", props -> new WallBlock(props.mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK)));
    public static final Block NETHERRACK_BRICKS = registerBlock("netherrack_bricks", props -> new Block(props.mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK)));
     public static final Block NETHERRACK_BRICK_STAIRS = registerBlock("netherrack_brick_stairs", props -> new StairBlock(NETHERRACK_BRICKS.defaultBlockState(), props.mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK)));
     public static final Block NETHERRACK_BRICK_SLAB = registerBlock("netherrack_brick_slab", props -> new SlabBlock(props.mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK)));
     public static final Block NETHERRACK_BRICK_WALL = registerBlock("netherrack_brick_wall", props -> new WallBlock(props.mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK)));
    public static final Block POLISHED_NETHERRACK = registerBlock("polished_netherrack", props -> new Block(props.mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK)));
     public static final Block POLISHED_NETHERRACK_STAIRS = registerBlock("polished_netherrack_stairs", props -> new StairBlock(POLISHED_NETHERRACK.defaultBlockState(), props.mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK)));
     public static final Block POLISHED_NETHERRACK_SLAB = registerBlock("polished_netherrack_slab", props -> new SlabBlock(props.mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK)));
     public static final Block POLISHED_NETHERRACK_WALL = registerBlock("polished_netherrack_wall", props -> new WallBlock(props.mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK)));
    public static final Block NETHERRACK_PILLAR = registerBlock("netherrack_pillar", props -> new RotatedPillarBlock(props.mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK)));
    public static final Block CHISELED_NETHERRACK = registerBlock("chiseled_netherrack", props -> new Block(props.mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK)));
    public static final Block NETHERRACK_TILES = registerBlock("netherrack_tiles", props -> new Block(props.mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK)));
     public static final Block NETHERRACK_TILES_STAIRS = registerBlock("netherrack_tiles_stairs", props -> new StairBlock(NETHERRACK_TILES.defaultBlockState(), props.mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK)));
     public static final Block NETHERRACK_TILES_SLAB = registerBlock("netherrack_tiles_slab", props -> new SlabBlock(props.mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK)));
     public static final Block NETHERRACK_TILES_WALL = registerBlock("netherrack_tiles_wall", props -> new WallBlock(props.mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK)));

    // Blackstone
    public static final Block BLACKSTONE_PILLAR = registerBlock("blackstone_pillar", props -> new RotatedPillarBlock(props.mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block BLACKSTONE_TILES = registerBlock("blackstone_tiles", props -> new Block(props.mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
     public static final Block BLACKSTONE_TILES_STAIRS = registerBlock("blackstone_tiles_stairs", props -> new StairBlock(Blocks.BLACKSTONE.defaultBlockState(), props.mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
     public static final Block BLACKSTONE_TILES_SLAB = registerBlock("blackstone_tiles_slab", props -> new SlabBlock(props.mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
     public static final Block BLACKSTONE_TILES_WALL = registerBlock("blackstone_tiles_wall", props -> new WallBlock(props.mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

     // Basalt
    public static final Block BASALT_BRICKS = registerBlock("basalt_bricks", props -> new Block(props.mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT)));
     public static final Block BASALT_BRICK_STAIRS = registerBlock("basalt_brick_stair", props -> new StairBlock(BASALT_BRICKS.defaultBlockState(), props.mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT)));
     public static final Block BASALT_BRICK_SLAB = registerBlock("basalt_brick_slab", props -> new SlabBlock(props.mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT)));
     public static final Block BASALT_BRICK_WALL = registerBlock("basalt_brick_wall", props -> new WallBlock(props.mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT)));
    public static final Block SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs", props -> new StairBlock(Blocks.SMOOTH_BASALT.defaultBlockState(), props.mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT)));
    public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab", props -> new SlabBlock(props.mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT)));
    public static final Block CHISELED_BASALT = registerBlock("chiseled_basalt", props -> new Block(props.mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT)));
    public static final Block BASALT_PILLAR = registerBlock("basalt_pillar", props -> new RotatedPillarBlock(props.mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT)));
    public static final Block BASALT_TILES = registerBlock("basalt_tiles", props -> new Block(props.mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT)));
     public static final Block BASALT_TILES_STAIRS = registerBlock("basalt_tiles_stairs", props -> new StairBlock(BASALT_TILES.defaultBlockState(), props.mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT)));
     public static final Block BASALT_TILES_SLAB = registerBlock("basalt_tiles_slab", props -> new SlabBlock(props.mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT)));
     public static final Block BASALT_TILES_WALL = registerBlock("basalt_tiles_wall", props -> new WallBlock(props.mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT)));

     //END STONE
    public static final Block END_STONE_STAIRS = registerBlock("end_stone_stairs", props -> new StairBlock(Blocks.END_STONE.defaultBlockState(), props.mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    public static final Block END_STONE_SLAB = registerBlock("end_stone_slab", props -> new SlabBlock(props.mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    public static final Block END_STONE_WALL = registerBlock("end_stone_wall", props -> new WallBlock(props.mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    public static final Block POLISHED_END_STONE = registerBlock("polished_end_stone", props -> new Block(props.mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
     public static final Block POLISHED_END_STONE_STAIRS = registerBlock("polished_end_stone_stairs", props -> new StairBlock(POLISHED_END_STONE.defaultBlockState(), props.mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
     public static final Block POLISHED_END_STONE_SLAB = registerBlock("polished_end_stone_slab", props -> new SlabBlock(props.mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
     public static final Block POLISHED_END_STONE_WALL = registerBlock("polished_end_stone_wall", props -> new WallBlock(props.mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    public static final Block CHISELED_END_STONE = registerBlock("chiseled_end_stone", props -> new Block(props.mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    public static final Block END_STONE_PILLAR = registerBlock("end_stone_pillar", props -> new RotatedPillarBlock(props.mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    public static final Block END_STONE_TILES = registerBlock("end_stone_tiles", props -> new Block(props.mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
     public static final Block END_STONE_TILES_STAIRS = registerBlock("end_stone_tiles_stairs", props -> new StairBlock(END_STONE_TILES.defaultBlockState(), props.mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
     public static final Block END_STONE_TILES_SLAB = registerBlock("end_stone_tiles_slab", props -> new SlabBlock(props.mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
     public static final Block END_STONE_TILES_WALL = registerBlock("end_stone_tiles_wall", props -> new WallBlock(props.mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));

     // PRISMARINE
    public static final Block PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall", props -> new WallBlock(props.mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_PRISMARINE = registerBlock("polished_prismarine", props -> new Block(props.mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
     public static final Block POLISHED_PRISMARINE_STAIRS = registerBlock("polished_prismarine_stairs", props -> new StairBlock(POLISHED_PRISMARINE.defaultBlockState(), props.mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
     public static final Block POLISHED_PRISMARINE_SLAB = registerBlock("polished_prismarine_slab", props -> new SlabBlock(props.mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
     public static final Block POLISHED_PRISMARINE_WALL = registerBlock("polished_prismarine_wall", props -> new WallBlock(props.mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CHISELED_PRISMARINE = registerBlock("chiseled_prismarine", props -> new Block(props.mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block PRISMARINE_PILLAR = registerBlock("prismarine_pillar", props -> new RotatedPillarBlock(props.mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block PRISMARINE_TILES = registerBlock("prismarine_tiles", props -> new Block(props.mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
     public static final Block PRISMARINE_TILES_STAIRS = registerBlock("prismarine_tiles_stairs", props -> new StairBlock(PRISMARINE_TILES.defaultBlockState(), props.mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
     public static final Block PRISMARINE_TILES_SLAB = registerBlock("prismarine_tiles_slab", props -> new SlabBlock(props.mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
     public static final Block PRISMARINE_TILES_WALL = registerBlock("prismarine_tiles_wall", props -> new WallBlock(props.mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

     // LAPIS
    public static final Block LAPIS_STAIRS = registerBlock("lapis_stairs", props -> new StairBlock(Blocks.LAPIS_BLOCK.defaultBlockState(), props.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F)));
    public static final Block LAPIS_SLAB = registerBlock("lapis_slab", props -> new SlabBlock(props.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F)));
    public static final Block LAPIS_BRICKS = registerBlock("lapis_bricks", props -> new Block(props.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F)));
     public static final Block LAPIS_BRICK_STAIRS = registerBlock("lapis_brick_stairs", props -> new StairBlock(LAPIS_BRICKS.defaultBlockState(), props.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F)));
     public static final Block LAPIS_BRICK_SLAB = registerBlock("lapis_brick_slab", props -> new SlabBlock(props.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F)));
    public static final Block LAPIS_BRICK_WALL = registerBlock("lapis_brick_wall", props -> new WallBlock(props.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F)));
    public static final Block SMOOTH_LAPIS = registerBlock("smooth_lapis", props -> new Block(props.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F)));
     public static final Block SMOOTH_LAPIS_STAIRS = registerBlock("smooth_lapis_stairs", props -> new StairBlock(SMOOTH_LAPIS.defaultBlockState(), props.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F)));
     public static final Block SMOOTH_LAPIS_SLAB = registerBlock("smooth_lapis_slab", props -> new SlabBlock(props.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F)));
    public static final Block CHISELED_LAPIS = registerBlock("chiseled_lapis", props -> new Block(props.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F)));
    public static final Block LAPIS_TILES = registerBlock("lapis_tiles", props -> new Block(props.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F)));
     public static final Block LAPIS_TILES_STAIRS = registerBlock("lapis_tiles_stairs", props -> new StairBlock(LAPIS_TILES.defaultBlockState(), props.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F)));
     public static final Block LAPIS_TILES_SLAB = registerBlock("lapis_tiles_slab", props -> new SlabBlock(props.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F)));
     public static final Block LAPIS_TILES_WALL = registerBlock("lapis_tiles_wall", props -> new WallBlock(props.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F)));
    public static final Block LAPIS_PILLAR = registerBlock("lapis_pillar", props -> new RotatedPillarBlock(props.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F)));


    // SULFUR
    public static final Block SULFUR_PILLAR = registerBlock("sulfur_pillar", props -> new RotatedPillarBlock(props.sound(SoundType.SULFUR).mapColor(MapColor.COLOR_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block SULFUR_TILES = registerBlock("sulfur_tiles", props -> new Block(props.sound(SoundType.SULFUR).mapColor(MapColor.COLOR_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
     public static final Block SULFUR_TILES_STAIRS = registerBlock("sulfur_tiles_stairs", props -> new StairBlock(SULFUR_TILES.defaultBlockState(), props.sound(SoundType.SULFUR).mapColor(MapColor.COLOR_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
     public static final Block SULFUR_TILES_SLAB = registerBlock("sulfur_tiles_slab", props -> new SlabBlock(props.sound(SoundType.SULFUR).mapColor(MapColor.COLOR_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
     public static final Block SULFUR_TILES_WALL = registerBlock("sulfur_tiles_wall", props -> new WallBlock(props.sound(SoundType.SULFUR).mapColor(MapColor.COLOR_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

     //CINNABAR
    public static final Block CINNABAR_PILLAR = registerBlock("cinnabar_pillar", props -> new RotatedPillarBlock(props.sound(SoundType.CINNABAR).mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CINNABAR_TILES = registerBlock("cinnabar_tiles", props -> new Block(props.sound(SoundType.CINNABAR).mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
     public static final Block CINNABAR_TILES_STAIRS = registerBlock("cinnabar_tiles_stairs", props -> new StairBlock(CINNABAR_TILES.defaultBlockState(), props.sound(SoundType.CINNABAR).mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
     public static final Block CINNABAR_TILES_SLAB = registerBlock("cinnabar_tiles_slab", props -> new SlabBlock(props.sound(SoundType.CINNABAR).mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
     public static final Block CINNABAR_TILES_WALL = registerBlock("cinnabar_tiles_wall", props -> new WallBlock(props.sound(SoundType.CINNABAR).mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

     // QUARTZ
    public static final Block QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs", props -> new StairBlock(Blocks.QUARTZ_BRICKS.defaultBlockState(), props.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab", props -> new SlabBlock(props.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall", props -> new WallBlock(props.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block QUARTZ_TILES = registerBlock("quartz_tiles", props -> new Block(props.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
     public static final Block QUARTZ_TILES_STAIRS = registerBlock("quartz_tiles_stairs", props -> new StairBlock(QUARTZ_TILES.defaultBlockState(), props.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
     public static final Block QUARTZ_TILES_SLAB = registerBlock("quartz_tiles_slab", props -> new SlabBlock(props.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
     public static final Block QUARTZ_TILES_WALL = registerBlock("quartz_tiles_wall", props -> new WallBlock(props.mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));

     // BRICKS KILL ME
    public static final Block WHITE_BRICKS = registerBlock("white_bricks", props -> new Block(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
     public static final Block WHITE_BRICK_STAIRS = registerBlock("white_brick_stairs", props -> new StairBlock(WHITE_BRICKS.defaultBlockState(), props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
     public static final Block WHITE_BRICK_SLAB = registerBlock("white_brick_slab", props -> new SlabBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
     public static final Block WHITE_BRICK_WALL = registerBlock("white_brick_wall", props -> new WallBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block GRAY_BRICKS = registerBlock("gray_bricks", props -> new Block(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block GRAY_BRICK_STAIRS = registerBlock("gray_brick_stairs", props -> new StairBlock(GRAY_BRICKS.defaultBlockState(), props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block GRAY_BRICK_SLAB = registerBlock("gray_brick_slab", props -> new SlabBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block GRAY_BRICK_WALL = registerBlock("gray_brick_wall", props -> new WallBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block LIGHT_GRAY_BRICKS = registerBlock("light_gray_bricks", props -> new Block(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block LIGHT_GRAY_BRICK_STAIRS = registerBlock("light_gray_brick_stairs", props -> new StairBlock(LIGHT_GRAY_BRICKS.defaultBlockState(), props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block LIGHT_GRAY_BRICK_SLAB = registerBlock("light_gray_brick_slab", props -> new SlabBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block LIGHT_GRAY_BRICK_WALL = registerBlock("light_gray_brick_wall", props -> new WallBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block BLACK_BRICKS = registerBlock("black_bricks", props -> new Block(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block BLACK_BRICK_STAIRS = registerBlock("black_brick_stairs", props -> new StairBlock(BLACK_BRICKS.defaultBlockState(), props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block BLACK_BRICK_SLAB = registerBlock("black_brick_slab", props -> new SlabBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block BLACK_BRICK_WALL = registerBlock("black_brick_wall", props -> new WallBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block RED_BRICKS = registerBlock("red_bricks", props -> new Block(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block RED_BRICK_STAIRS = registerBlock("red_brick_stairs", props -> new StairBlock(RED_BRICKS.defaultBlockState(), props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block RED_BRICK_SLAB = registerBlock("red_brick_slab", props -> new SlabBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block RED_BRICK_WALL = registerBlock("red_brick_wall", props -> new WallBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block ORANGE_BRICKS = registerBlock("orange_bricks", props -> new Block(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block ORANGE_BRICK_STAIRS = registerBlock("orange_brick_stairs", props -> new StairBlock(ORANGE_BRICKS.defaultBlockState(), props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block ORANGE_BRICK_SLAB = registerBlock("orange_brick_slab", props -> new SlabBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block ORANGE_BRICK_WALL = registerBlock("orange_brick_wall", props -> new WallBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block YELLOW_BRICKS = registerBlock("yellow_bricks", props -> new Block(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block YELLOW_BRICK_STAIRS = registerBlock("yellow_brick_stairs", props -> new StairBlock(YELLOW_BRICKS.defaultBlockState(), props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block YELLOW_BRICK_SLAB = registerBlock("yellow_brick_slab", props -> new SlabBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block YELLOW_BRICK_WALL = registerBlock("yellow_brick_wall", props -> new WallBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block LIME_BRICKS = registerBlock("lime_bricks", props -> new Block(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block LIME_BRICK_STAIRS = registerBlock("lime_brick_stairs", props -> new StairBlock(LIME_BRICKS.defaultBlockState(), props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block LIME_BRICK_SLAB = registerBlock("lime_brick_slab", props -> new SlabBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block LIME_BRICK_WALL = registerBlock("lime_brick_wall", props -> new WallBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block GREEN_BRICKS = registerBlock("green_bricks", props -> new Block(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block GREEN_BRICK_STAIRS = registerBlock("green_brick_stairs", props -> new StairBlock(GREEN_BRICKS.defaultBlockState(), props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block GREEN_BRICK_SLAB = registerBlock("green_brick_slab", props -> new SlabBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block GREEN_BRICK_WALL = registerBlock("green_brick_wall", props -> new WallBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block CYAN_BRICKS = registerBlock("cyan_bricks", props -> new Block(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block CYAN_BRICK_STAIRS = registerBlock("cyan_brick_stairs", props -> new StairBlock(CYAN_BRICKS.defaultBlockState(), props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block CYAN_BRICK_SLAB = registerBlock("cyan_brick_slab", props -> new SlabBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block CYAN_BRICK_WALL = registerBlock("cyan_brick_wall", props -> new WallBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block LIGHT_BLUE_BRICKS = registerBlock("light_blue_bricks", props -> new Block(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block LIGHT_BLUE_BRICK_STAIRS = registerBlock("light_blue_brick_stairs", props -> new StairBlock(LIGHT_BLUE_BRICKS.defaultBlockState(), props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block LIGHT_BLUE_BRICK_SLAB = registerBlock("light_blue_brick_slab", props -> new SlabBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block LIGHT_BLUE_BRICK_WALL = registerBlock("light_blue_brick_wall", props -> new WallBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block BLUE_BRICKS = registerBlock("blue_bricks", props -> new Block(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block BLUE_BRICK_STAIRS = registerBlock("blue_brick_stairs", props -> new StairBlock(BLUE_BRICKS.defaultBlockState(), props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block BLUE_BRICK_SLAB = registerBlock("blue_brick_slab", props -> new SlabBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block BLUE_BRICK_WALL = registerBlock("blue_brick_wall", props -> new WallBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block PURPLE_BRICKS = registerBlock("purple_bricks", props -> new Block(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block PURPLE_BRICK_STAIRS = registerBlock("purple_brick_stairs", props -> new StairBlock(PURPLE_BRICKS.defaultBlockState(), props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block PURPLE_BRICK_SLAB = registerBlock("purple_brick_slab", props -> new SlabBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block PURPLE_BRICK_WALL = registerBlock("purple_brick_wall", props -> new WallBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block MAGENTA_BRICKS = registerBlock("magenta_bricks", props -> new Block(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block MAGENTA_BRICK_STAIRS = registerBlock("magenta_brick_stairs", props -> new StairBlock(MAGENTA_BRICKS.defaultBlockState(), props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block MAGENTA_BRICK_SLAB = registerBlock("magenta_brick_slab", props -> new SlabBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block MAGENTA_BRICK_WALL = registerBlock("magenta_brick_wall", props -> new WallBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block PINK_BRICKS = registerBlock("pink_bricks", props -> new Block(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block PINK_BRICK_STAIRS = registerBlock("pink_brick_stairs", props -> new StairBlock(PINK_BRICKS.defaultBlockState(), props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block PINK_BRICK_SLAB = registerBlock("pink_brick_slab", props -> new SlabBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block PINK_BRICK_WALL = registerBlock("pink_brick_wall", props -> new WallBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block BROWN_BRICKS = registerBlock("brown_bricks", props -> new Block(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block BROWN_BRICK_STAIRS = registerBlock("browm_brick_stairs", props -> new StairBlock(BROWN_BRICKS.defaultBlockState(), props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block BROWN_BRICK_SLAB = registerBlock("browm_brick_slab", props -> new SlabBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block BROWN_BRICK_WALL = registerBlock("brown_brick_wall", props -> new WallBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block MONOCHROME_BRICKS = registerBlock("monochrome_bricks", props -> new Block(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block MONOCHROME_BRICK_STAIRS = registerBlock("monochrome_brick_stairs", props -> new StairBlock(MONOCHROME_BRICKS.defaultBlockState(), props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block MONOCHROME_BRICK_SLAB = registerBlock("monochrome_brick_slab", props -> new SlabBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block MONOCHROME_BRICK_WALL = registerBlock("monochrome_brick_wall", props -> new WallBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block WARM_BRICKS = registerBlock("warm_bricks", props -> new Block(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block WARM_BRICK_STAIRS = registerBlock("warm_brick_stairs", props -> new StairBlock(WARM_BRICKS.defaultBlockState(), props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block WARM_BRICK_SLAB = registerBlock("warm_brick_slab", props -> new SlabBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block WARM_BRICK_WALL = registerBlock("warm_brick_wall", props -> new WallBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block COLD_BRICKS = registerBlock("cold_bricks", props -> new Block(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block COLD_BRICK_STAIRS = registerBlock("cold_brick_stairs", props -> new StairBlock(COLD_BRICKS.defaultBlockState(), props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block COLD_BRICK_SLAB = registerBlock("cold_brick_slab", props -> new SlabBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block COLD_BRICK_WALL = registerBlock("cold_brick_wall", props -> new WallBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block SPRING_BRICKS = registerBlock("spring_bricks", props -> new Block(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block SPRING_BRICK_STAIRS = registerBlock("spring_brick_stairs", props -> new StairBlock(SPRING_BRICKS.defaultBlockState(), props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block SPRING_BRICK_SLAB = registerBlock("spring_brick_slab", props -> new SlabBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block SPRING_BRICK_WALL = registerBlock("spring_brick_wall", props -> new WallBlock(props.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));


    //LANTERNS
    public static final Block LARGE_LANTERN = registerBlock("large_lantern", props -> new Block(props.mapColor(MapColor.METAL).forceSolidOn().strength(3.5F).sound(SoundType.LANTERN).lightLevel((state) -> 15).noOcclusion().pushReaction(PushReaction.POPPED)));
    public static final Block LARGE_SOUL_LANTERN = registerBlock("large_soul_lantern", props -> new Block(props.mapColor(MapColor.METAL).forceSolidOn().strength(3.5F).sound(SoundType.LANTERN).lightLevel((state) -> 8).noOcclusion().pushReaction(PushReaction.POPPED)));

    //CROP BLOCKS
    public static final Block LARGE_APPLE = registerBlock("large_apple", props -> new AppleBlock(props.strength(1.0f)));
    public static final Block CARVED_LARGE_APPLE = registerBlock("carved_large_apple", props -> new CarvedPumpkinBlock(props.strength(1.0f)));
    public static final Block LARGE_CHORUS_FRUIT = registerBlock("large_chorus_fruit", props -> new ChorusBlock(props.strength(1.0f)));
    public static final Block CARVED_LARGE_CHORUS_FRUIT = registerBlock("carved_large_chorus_fruit", props -> new CarvedPumpkinBlock(props.strength(1.0f)));
    public static final Block LARGE_CARROT = registerBlock("large_carrot", props -> new Block(props.strength(1.0f)));
    public static final Block LARGE_POTATO = registerBlock("large_potato", props -> new Block(props.strength(1.0f)));
    public static final Block LARGE_BEETROOT = registerBlock("large_beetroot", props -> new Block(props.strength(1.0f)));
    public static final Block LARGE_GOLDEN_APPLE = registerBlock("large_golden_apple", props -> new GoldenAppleBlock(props.strength(1.0f)));
    public static final Block CARVED_LARGE_GOLDEN_APPLE = registerBlock("carved_large_golden_apple", props -> new CarvedPumpkinBlock(props.strength(1.0f)));

    //METAL BARRELS
    public static final Block IRON_BARREL = registerBlock("iron_barrel", props -> new BarrelBlock(props.mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.IRON)));
    public static final Block GOLD_BARREL = registerBlock("gold_barrel", props -> new BarrelBlock(props.mapColor(MapColor.GOLD).instrument(NoteBlockInstrument.BELL).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL)));


    public static ResourceKey<Block> getRK(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
    }

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(UnorganizedDeco.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(UnorganizedDeco.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(UnorganizedDeco.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(UnorganizedDeco.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        UnorganizedDeco.LOGGER.info("Registering Mod Blocks for " + UnorganizedDeco.MOD_ID);
    }
}
