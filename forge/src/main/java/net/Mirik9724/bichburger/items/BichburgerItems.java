package net.Mirik9724.bichburger.items;

import com.mojang.blaze3d.shaders.Effect;
import net.Mirik9724.bichburger.Bichburger;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PotionItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.Mirik9724.bichburger.items.BichburgeItemGroup.*;

public class BichburgerItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Bichburger.MODID);
    public static final RegistryObject<Item> Burger = ITEMS.register("burger", () -> new Item(new Item.Properties().tab(Bichburger_group).food(BichburgerItemFood.Burger)));
    public static final RegistryObject<Item> Black_Burger = ITEMS.register("black_burger", () -> new Item(new Item.Properties().tab(Bichburger_group).food((BichburgerItemFood.Black_Burger))));
    public static final RegistryObject<Item> French_fries = ITEMS.register("french_fries", () -> new Item(new Item.Properties().tab(Bichburger_group).food(BichburgerItemFood.French_fries)));
    public static final RegistryObject<Item> Bich_nagens = ITEMS.register("bich_nagens", () -> new Item(new Item.Properties().tab(Bichburger_group).food(BichburgerItemFood.Bich_nagens)));
    public static final RegistryObject<Item> Bich_cola = ITEMS.register("bich_cola", () -> new PotionItem(new Item.Properties().tab(Bichburger_group).food(BichburgerItemFood.Bich_cola).stacksTo(16)));
    public static final RegistryObject<Item> Bich_lemonade = ITEMS.register("bich_lemonade", () -> new PotionItem(new Item.Properties().tab(Bichburger_group).food(BichburgerItemFood.Bich_lemonade).stacksTo(16)));
    public static final RegistryObject<Item> Beer_shrimp = ITEMS.register("beer_shrimp", () -> new PotionItem(new Item.Properties().tab(Bichburger_group).food(BichburgerItemFood.Beer_shrimp).stacksTo(16)));
    public static final RegistryObject<Item> Burger_bun = ITEMS.register("burger_bun", () -> new Item(new Item.Properties().tab(Bichburger_group).food(BichburgerItemFood.Burger_bun)));
    public static final RegistryObject<Item> Black_burger_bun = ITEMS.register("black_burger_bun", () -> new Item(new Item.Properties().tab(Bichburger_group).food(BichburgerItemFood.Black_burger_bun)));
//    public static final RegistryObject<PotionItem> Gugu = ITEMS.register("gudu", () -> new PotionItem(new PotionItem.Properties().tab(Bichburger_group).food(BichburgerItemFood.Burger)));

//    public static final RegistryObject<Item> CAN = ITEMS.register("can", () -> new Item(new Item.Properties().tab(Bichburger_group)));
//    public static final RegistryObject<Item> CAN_WITH_FOOD = ITEMS.register("can_with_food", () -> new BichburgerFoodPotion(new Item.Properties().tab(Bichburger_group).food(BichburgerItemFood.CAN_WITH_FOOD).stacksTo(1)));
}

