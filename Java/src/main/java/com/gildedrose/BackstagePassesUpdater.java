package com.gildedrose;

abstract class BackstagePassesUpdater extends Updater{

    static void updateItem(Item item){
        updateQuality(item);
        updateSellIn(item);
        makeItemNotExceedMaximumQuality(item);
    }

    private static void updateQuality(Item item) {
        if (item.sellIn <= 0) {
            item.quality = 0;
        } else if (item.sellIn <= 5) {
            increaseQuality(item, 3);
        } else if (item.sellIn <= 10) {
            increaseQuality(item, 2);
        } else {
            increaseQuality(item, 1);
        }
    }

}
