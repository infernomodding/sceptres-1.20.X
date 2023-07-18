package net.inferno.sceptres;

import net.fabricmc.api.ModInitializer;

import net.inferno.sceptres.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SceptresMod implements ModInitializer {
	public static final String MOD_ID = "sceptres";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}