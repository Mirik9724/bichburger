package net.Mirik9724.bichburger.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PotionItem;
import net.minecraft.world.World;

public class BichburgerItemsEffects extends PotionItem{

    public BichburgerItemsEffects(Item.Settings settings) {
        super(settings);
    }

        @Override
        public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
            super.finishUsing(stack, world, user);
            if (!world.isClient) {
                // эффект скорости на 1 минуту с уровнем 1
//                user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1200, 0));
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 0));
                // эффект регенерации на 30 секунд с уровнем 1
//                user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600, 0));
            }

            return stack;
        }
}
