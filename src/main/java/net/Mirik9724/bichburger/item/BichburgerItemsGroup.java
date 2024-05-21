package net.Mirik9724.bichburger.item;

import net.fabricmc.fabric.api.itemgroup.v1.*;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.Mirik9724.bichburger.Bichburger;

public class BichburgerItemsGroup {
    public static final ItemGroup bichburger_group = FabricItemGroup.builder(new Identifier(Bichburger.MOD_ID, "bichburger_group")).icon(() -> new ItemStack(BichburgerItems.Burger)).build();
}
