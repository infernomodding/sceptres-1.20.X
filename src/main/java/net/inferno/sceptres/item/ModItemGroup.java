package net.inferno.sceptres.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.inferno.sceptres.SceptresMod;
import net.inferno.sceptres.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup SCEPTRES_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SceptresMod.MOD_ID, "sceptres_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.sceptres.group"))
                    .icon(() -> new ItemStack(ModItems.GOLDEN_SCEPTRE)).entries((displayContext, entries) -> {

                        entries.add(ModItems.GOLDEN_SCEPTRE);

                        entries.add(ModBlocks.CHALK_TEST);
                        entries.add(ModBlocks.ADAMANTITE_ORE);

                    }).build());

    public  static  void registerItemGroups() {

    }
}
