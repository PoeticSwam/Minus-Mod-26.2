package net.poeticswam.minusmod.item.custom;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class CustomStewItem extends Item {

    public CustomStewItem(Properties settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level world, LivingEntity user) {
        super.finishUsingItem(stack, world, user);

        if (user instanceof Player player && !player.getAbilities().instabuild) {
            return new ItemStack(Items.BOWL);
        }

        return stack;
    }
}
