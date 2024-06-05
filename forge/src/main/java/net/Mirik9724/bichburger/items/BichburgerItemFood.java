package net.Mirik9724.bichburger.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

import java.util.Properties;

public class BichburgerItemFood {
    public static final FoodProperties Burger = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.3F).build();
    public static final FoodProperties Black_Burger = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.3F).build();
    public static final FoodProperties French_fries = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.3F).build();
    public static final FoodProperties Bich_nagens = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.3F).build();
    public static final FoodProperties Bich_cola = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.3F).build();
    public static final FoodProperties Bich_lemonade = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.3F).build();
    public static final FoodProperties Beer_shrimp = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.3F).build();
    public static final FoodProperties Burger_bun = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.3F).build();
    public static final FoodProperties Black_burger_bun = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.3F).build();
    public static final FoodProperties CAN_WITH_FOOD = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.8F).meat().build();
}
