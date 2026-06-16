package com.seriousmod.init;

import com.seriousmod.SeriousMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.text.Text;

public class ModItemGroups {
    private static ItemGroup register(String name, ItemGroup itemGroup) {
        return Registry.register(
                Registries.ITEM_GROUP,
                Identifier.of(SeriousMod.MOD_ID, name),
                itemGroup
        );
    }

//    public static final ItemGroup SERIOUS_GROUP =
//            register(
//                    "serious_group",
//                    FabricItemGroup.builder()
//                            .displayName(Text.translatable("itemGroup.seriousmod"))
//                            .icon(() -> new ItemStack(ModItems.EXAMPLE_ITEM))
//                            .entries((context, entries) -> {
//                                entries.add(ModItems.EXAMPLE_ITEM);
//                            })
//                            .build()
//            );

    public static void initialize() {
        SeriousMod.LOGGER.info("Initializing item groups for {}", SeriousMod.MOD_ID);
    }
}