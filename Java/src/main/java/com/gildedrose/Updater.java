package com.gildedrose;

abstract class Updater {

    static void updateItem(Item item){
        updateQuality(item);
        updateSellIn(item);
        makeItemNotExceedMaximumQuality(item);
    }

    private static void updateQuality(Item item) {
        decreaseQuality(item);
        if (item.sellIn < 0) {
            decreaseQuality(item);
        }
    }

    static void makeItemNotExceedMaximumQuality(Item item) {
        if (item.quality < 0) {
            item.quality = 0;
        }
        if (item.quality > 50) {
            item.quality = 50;
        }
    }

    static void increaseQuality(Item item) {
        increaseQuality(item, 1);
    }

    static void increaseQuality(Item item, int amount) {
        item.quality = item.quality + amount;
    }

    static void decreaseQuality(Item item) {
        item.quality = item.quality - 1;
    }

    static void decreaseQuality(Item item, int amount) {
        item.quality = item.quality - amount;
    }

    static void updateSellIn(Item item){
        item.sellIn = item.sellIn - 1;
    }

}
