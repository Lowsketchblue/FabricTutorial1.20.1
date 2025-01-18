package net.lowsketch.tutorialmod;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.lowsketch.tutorialmod.block.ModBlocks;
import net.lowsketch.tutorialmod.item.ModItems;
import net.lowsketch.tutorialmod.item.ModItemsGroups;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";

	// This logger is used to write text to the console and the log file.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

		ModItemsGroups.registerItemGroups();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.RUBY, 200);
	}
}