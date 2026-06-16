package com.seriousmod.init;

import com.seriousmod.SeriousMod;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModStatusEffects {
    private static StatusEffect register(String name, StatusEffect effect) {
        return Registry.register(
                Registries.STATUS_EFFECT,
                Identifier.of(SeriousMod.MOD_ID, name),
                effect
        );
    }

//    public static final StatusEffect EXAMPLE_EFFECT =
//            register(
//                    "example_effect",
//                    new StatusEffect(
//                            StatusEffectCategory.BENEFICIAL,
//                            0x55FF55
//                    ) {}
//            );

    public static void initialize() {
        SeriousMod.LOGGER.info("Initializing status effects for {}", SeriousMod.MOD_ID);
    }
}