package net.lowsketch.tutorialmod.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent RUBY = new FoodComponent.Builder().hunger(3).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 200), 1f).build();
}
