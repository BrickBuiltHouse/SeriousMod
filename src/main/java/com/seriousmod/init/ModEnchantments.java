package com.seriousmod.init;

import com.seriousmod.SeriousMod;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModEnchantments {
    // Enchantments in 1.21.x are *data-driven*, so we create a RegistryKey (identifier) instead of registering an instance.
    private static RegistryKey<Enchantment> key(String name) {
        return RegistryKey.of(
                RegistryKeys.ENCHANTMENT,
                Identifier.of(SeriousMod.MOD_ID, name)
        );
    }

//    public static final RegistryKey<Enchantment> EXAMPLE_ENCHANTMENT =
//            key("example_enchantment");

    public static void initialize() {
        SeriousMod.LOGGER.info("Initializing enchantments for {}", SeriousMod.MOD_ID);
    }
}