package com.gildedrose;

public abstract class Updater {

    static void updateItem(Item item){
        decreaseQuality(item);
        if (item.sellIn < 0) {
            decreaseQuality(item);
        }
        updateSellIn(item);
    }

    static void increaseQuality(Item item) {
        increaseQuality(item, 1);
    }

    static void increaseQuality(Item item, int i) {
        item.quality = item.quality + i;
    }

    static void decreaseQuality(Item item) {
        item.quality = item.quality - 1;
    }

    static void updateSellIn(Item item){
        item.sellIn = item.sellIn - 1;
    }

}
