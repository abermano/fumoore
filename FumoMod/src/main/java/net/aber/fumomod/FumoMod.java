package net.aber.fumomod;

import net.aber.fumomod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FumoMod implements ModInitializer {
	public static final String MOD_ID = "fumomod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();



	}
}
