package net.Mirik9724.bichburger.items;

import net.Mirik9724.bichburger.Bichburger;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import static net.Mirik9724.bichburger.items.BichburgerItems.ITEMS;


public class BichburgeItemGroup {
    public static final CreativeModeTab Bichburger_group = new CreativeModeTab("Bichburger_group") {
        public ItemStack makeIcon() {
            return new ItemStack(BichburgerItems.Burger.get());
        }
    };


}