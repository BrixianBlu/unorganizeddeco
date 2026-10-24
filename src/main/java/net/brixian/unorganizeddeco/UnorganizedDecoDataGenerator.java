package net.brixian.unorganizeddeco;

import net.brixian.unorganizeddeco.data.UDBlockTagData;
import net.brixian.unorganizeddeco.data.UDModelData;
import net.brixian.unorganizeddeco.data.UDREcipeData;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class UnorganizedDecoDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(UDModelData::new);
		pack.addProvider(UDBlockTagData::new);
		pack.addProvider(UDREcipeData::new);

	}
}
