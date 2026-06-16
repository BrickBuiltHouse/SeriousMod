package com.seriousmod.init;

import com.seriousmod.SeriousMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    private static Item register(String name, Item item) {
        return Registry.register(
                Registries.ITEM,
                Identifier.of(SeriousMod.MOD_ID, name),
                item
        );
    }

//    public static final Item EXAMPLE_ITEM =
//            register("example_item", new Item(new Item.Settings()));

    public static void initialize() {
        SeriousMod.LOGGER.info("Initializing items for {}", SeriousMod.MOD_ID);
    }
}