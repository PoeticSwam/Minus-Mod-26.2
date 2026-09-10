package net.poeticswam.minusmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents; // Added Import
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.poeticswam.minusmod.block.ModBlocks;
import net.poeticswam.minusmod.effect.ModEffects;
import net.poeticswam.minusmod.item.ModItems;
import net.poeticswam.minusmod.potion.ModPotions;
import net.poeticswam.minusmod.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;

public class MinusMod implements ModInitializer {
    public static final String MOD_ID = "minusmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModBlocks.registerModBlocks();
        ModItems.registerModItems();
        ModEffects.registerEffects();
        ModPotions.registerPotions();
        ModLootTableModifiers.modifyLootTables();


        ServerLivingEntityEvents.ALLOW_DAMAGE.register((entity, source, amount) -> {
            if (entity.hasEffect(ModEffects.STONESKIN)) {

                // Filter out Magic Damage
                if (source.is(DamageTypeTags.WITCH_RESISTANT_TO) || source.is(DamageTypes.MAGIC) || source.is(DamageTypes.INDIRECT_MAGIC)) {
                    return true;
                }

                // Filter out "Absolute" damage (like the Void or /kill)
                if (source.is(DamageTypeTags.BYPASSES_INVULNERABILITY)) {
                    return true;
                }

                // Apply Threshold logic to all other types of damage
                int amplifier = entity.getEffect(ModEffects.STONESKIN).getAmplifier();
                float threshold = 1.0f * (amplifier + 1);

                return !(amount <= threshold); // Block physical damage below the limit
            }
            return true;
        });


        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> builder.addMix(Potions.AWKWARD, Items.SLIME_BALL, ModPotions.MONSTER_MASTER_COLOGNE));
        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> builder.addMix(Potions.LEAPING, ModItems.FERMENTED_GLOWSTONE_DUST, ModPotions.ROCKET_POTION));
        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> builder.addMix(Potions.THICK, Items.CLAY_BALL, ModPotions.STONESKIN_POTION_1));
        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> builder.addMix(ModPotions.STONESKIN_POTION_1, Items.GLOWSTONE_DUST, ModPotions.STONESKIN_POTION_2));
        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> builder.addMix(ModPotions.STONESKIN_POTION_2, Items.GLOWSTONE_DUST, ModPotions.STONESKIN_POTION_3));
        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> builder.addMix(ModPotions.STONESKIN_POTION_3, ModItems.FERMENTED_GLOWSTONE_DUST, ModPotions.STONESKIN_POTION_4));
        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> builder.addMix(ModPotions.STONESKIN_POTION_4, ModItems.FERMENTED_GLOWSTONE_DUST, ModPotions.STONESKIN_POTION_5));
        FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(mod -> ServerLifecycleEvents.SERVER_STARTING.register(server -> LOGGER.info("MinusMod dev data pack should now be loaded")));
    }
}