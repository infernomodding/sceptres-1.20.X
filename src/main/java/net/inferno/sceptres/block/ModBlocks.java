package net.inferno.sceptres.block;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.inferno.sceptres.SceptresMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public  static  final Block CHALK_TEST = registerBlock("chalk_test",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public  static  final Block ADAMANTITE_ORE = registerBlock("adamantite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));

    private  static  Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SceptresMod.MOD_ID, name), block);
    }

    private static  Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(SceptresMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));

    }

    public static void registerModBlocks(){
        SceptresMod.LOGGER.info("Registering ModBlocks for " + SceptresMod.MOD_ID);
    }
}
