package net.lowsketch.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.lowsketch.tutorialmod.TutorialMod;
import net.lowsketch.tutorialmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemsGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                    //From here just add the custom items
                    entries.add(ModItems.RUBY);
                    entries.add(ModItems.RAW_RUBY);
                    entries.add(ModItems.METAL_DETECTOR);

                    entries.add(ModBlocks.RUBY_BLOCK);
                    entries.add(ModBlocks.RAW_RUBY_BLOCK);

                    entries.add(Items.DIAMOND);
            }).build());
    public static void registerItemGroups(){
        TutorialMod.LOGGER.info("Registering net.lowsketch.tutorialmod.item groups for "+ TutorialMod.MOD_ID);
    }
}
