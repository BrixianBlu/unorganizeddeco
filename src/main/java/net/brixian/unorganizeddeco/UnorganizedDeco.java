package net.brixian.unorganizeddeco;

import net.brixian.unorganizeddeco.registry.UDecoBlocks;
import net.brixian.unorganizeddeco.registry.UDecoCreativeTab;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UnorganizedDeco implements ModInitializer {
	public static final String MOD_ID = "unorganizeddeco";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		UDecoBlocks.registerModBlocks();
		UDecoCreativeTab.registerEDModCreativeModeTabs();


		LOGGER.info("Hey Chat Un0rg4NiZedDec0 here");
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
