package com.seriousmod.init;

import com.seriousmod.SeriousMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    private static <T extends Entity> EntityType<T> register(String name, EntityType<T> entityType) {
        return Registry.register(
                Registries.ENTITY_TYPE,
                Identifier.of(SeriousMod.MOD_ID, name),
                entityType
        );
    }

//    public static final EntityType<ExampleEntity> EXAMPLE_ENTITY =
//            register(
//                    "example_entity",
//                    EntityType.Builder
//                            .create(ExampleEntity::new, SpawnGroup.CREATURE)
//                            .dimensions(0.6f, 1.8f)
//                            .build()
//            );

    public static void initialize() {
        SeriousMod.LOGGER.info("Initializing entities for {}", SeriousMod.MOD_ID);
    }
}