package net.poeticswam.minusmod.item.custom;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class CustomIceCreamItem extends Item {

    public CustomIceCreamItem(Properties settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level world, LivingEntity user) {
        super.finishUsingItem(stack, world, user);

        if (user instanceof Player player && !player.getAbilities().instabuild) {
            ItemStack stick = new ItemStack(Items.STICK);

            if (!player.getInventory().add(stick)) {
                player.drop(stick, false);
            }
        }

        return stack;
    }
}