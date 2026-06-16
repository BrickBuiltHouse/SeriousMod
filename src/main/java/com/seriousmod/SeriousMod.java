package com.seriousmod;

import com.seriousmod.init.*;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SeriousMod implements ModInitializer {
    public static final String MOD_ID = "seriousmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.initialize();
        ModBlocks.initialize();
        ModEnchantments.initialize();
        ModStatusEffects.initialize();
        ModSoundEvents.initialize();
        ModItemGroups.initialize();
    }
}
