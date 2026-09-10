package net.poeticswam.minusmod.effect;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.poeticswam.minusmod.MinusMod;

public class ModEffects {
    public static final Holder<MobEffect> COLOGNE = registerStatusEffect("cologne",
            new CologneEffect(MobEffectCategory.BENEFICIAL, 0x4a0033)
                    .addAttributeModifier(Attributes.LUCK,
                            Identifier.fromNamespaceAndPath(MinusMod.MOD_ID, "cologne"),3,
                            AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    public static final Holder<MobEffect> ROCKET = registerStatusEffect("rocket",
            new RocketEffect(MobEffectCategory.NEUTRAL, 0xebff84)
                    .addAttributeModifier(Attributes.JUMP_STRENGTH,
                            Identifier.fromNamespaceAndPath(MinusMod.MOD_ID, "rocket"),20,
                            AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    public static final Holder<MobEffect> STONESKIN = registerStatusEffect("stoneskin",
            new StoneskinEffect(MobEffectCategory.BENEFICIAL, 0x6e6e6e));


    private static Holder<MobEffect> registerStatusEffect(String name, MobEffect statusEffect) {
        return Registry.registerForHolder(BuiltInRegistries.MOB_EFFECT, Identifier.fromNamespaceAndPath(MinusMod.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        MinusMod.LOGGER.info("Registering Mod Effects for " + MinusMod.MOD_ID);
    }
}
