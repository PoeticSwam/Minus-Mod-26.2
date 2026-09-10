package net.poeticswam.minusmod.item;

import static net.minecraft.world.item.component.Consumables.defaultDrink;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import net.minecraft.world.item.consume_effects.RemoveStatusEffectsConsumeEffect;

public class ModConsumableComponents {
    public static final Consumable MELON_JUICE = defaultDrink().consumeSeconds(2.0F).sound(SoundEvents.GENERIC_DRINK).onConsume(new RemoveStatusEffectsConsumeEffect(MobEffects.NAUSEA)).build();
    public static final Consumable FERMENTED_MELON_JUICE = defaultDrink().consumeSeconds(2.0F).sound(SoundEvents.GENERIC_DRINK).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NAUSEA, 300, 0))).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOWNESS, 600, 1))).build();
}