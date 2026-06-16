package com.seriousmod.init;

import com.seriousmod.SeriousMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    private static Block register(String name, Block block) {
        Block registered = Registry.register(
                Registries.BLOCK,
                Identifier.of(SeriousMod.MOD_ID, name),
                block
        );

        Registry.register(
                Registries.ITEM,
                Identifier.of(SeriousMod.MOD_ID, name),
                new BlockItem(registered, new Item.Settings())
        );

        return registered;
    }

//    public static final Block EXAMPLE_BLOCK =
//            register(
//                    "example_block",
//                    new Block(
//                            AbstractBlock.Settings
//                                    .create()
//                                    .mapColor(MapColor.STONE_GRAY)
//                                    .strength(3.0f)
//                    )
//            );

    public static void initialize() {
        SeriousMod.LOGGER.info("Initializing blocks for {}", SeriousMod.MOD_ID);
    }
}