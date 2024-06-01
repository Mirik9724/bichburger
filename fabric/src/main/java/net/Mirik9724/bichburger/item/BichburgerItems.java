package net.Mirik9724.bichburger.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.*;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.Mirik9724.bichburger.Bichburger;
import net.Mirik9724.bichburger.item.*;
import net.minecraft.item.Item;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.IdentifiableItemGroup;
import net.Mirik9724.bichburger.item.BichburgerItemsGroup;


public class BichburgerItems {
    public static final Item Burger = regisetItem("burger", new Item(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(6).alwaysEdible().build())), BichburgerItemsGroup.bichburger_group);
    public static final Item Black_Burger = regisetItem("black_burger", new Item(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(6).alwaysEdible().build())), BichburgerItemsGroup.bichburger_group);
    public static final Item French_fries = regisetItem("french_fries", new Item(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(5).alwaysEdible().meat().build())), BichburgerItemsGroup.bichburger_group);
    public static final Item Bich_nagens = regisetItem("bich_nagens", new Item(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(4).alwaysEdible().meat().build())), BichburgerItemsGroup.bichburger_group);
    public static final Item Bich_cola = regisetItem("bich_cola", new Item(new FabricItemSettings().maxCount(16)
            .food(new FoodComponent.Builder().hunger(3).alwaysEdible().meat().build())), BichburgerItemsGroup.bichburger_group);
    public static final Item Bich_lemonade = regisetItem("bich_lemonade", new Item(new FabricItemSettings().maxCount(16)
            .food(new FoodComponent.Builder().hunger(3).alwaysEdible().meat().build())), BichburgerItemsGroup.bichburger_group);
    public static final Item Beer_shrimp = regisetItem("beer_shrimp", new Item(new FabricItemSettings().maxCount(16)
            .food(new FoodComponent.Builder().hunger(3).alwaysEdible().meat().build())), BichburgerItemsGroup.bichburger_group);
    public static final Item Burger_bun = regisetItem("burger_bun", new Item(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(1).meat().build())), BichburgerItemsGroup.bichburger_group);
    public static final Item Black_burger_bun = regisetItem("black_burger_bun", new Item(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(1).meat().build())), BichburgerItemsGroup.bichburger_group);
    private static Item regisetItem(String id, Item item) { return Registry.register(Registries.ITEM, new Identifier(Bichburger.MOD_ID, id), item);}
    private static Item regisetItem(String id, Item item, ItemGroup itemGroup) {
        Item returnItem = Registry.register(Registries.ITEM, new Identifier(Bichburger.MOD_ID, id), item);
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(returnItem));

        return returnItem;
    }
    public static void register () {
        Bichburger.LOGGER.debug("Registering items fro:" + Bichburger.MOD_ID);
    }
    public static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }}



//    public static final Item YOUR_ITEM = new Item(new Item.Settings().group(bichburger.ITEM_GROUP));