package net.brixian.unorganizeddeco.registry;

import net.brixian.unorganizeddeco.UnorganizedDeco;
import net.brixian.unorganizeddeco.block.entity.BarrelBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class UDecoBlockEntities {
    public static <T extends BlockEntityType<?>> T register(String path, T blockEntityType) {
        return Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, Identifier.fromNamespaceAndPath(UnorganizedDeco.MOD_ID, path), blockEntityType);
    }
    public static final BlockEntityType<BarrelBlockEntity> BARREL = register(
            "barrel", FabricBlockEntityTypeBuilder.create(net.brixian.unorganizeddeco.block.entity.BarrelBlockEntity::new,
                            UDecoBlocks.IRON_BARREL,
                            UDecoBlocks.GOLD_BARREL)
                    .build()
    );


    public static void register() {
        UnorganizedDeco.LOGGER.info("Registering block entity types for " + UnorganizedDeco.MOD_ID);
    }
}
