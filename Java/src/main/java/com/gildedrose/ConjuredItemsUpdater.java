package com.gildedrose;

abstract class ConjuredItemsUpdater extends Updater{

    static void updateItem(Item item){
        updateQuality(item);
        updateSellIn(item);
        makeItemNotExceedMaximumQuality(item);
    }

    private static void updateQuality(Item item) {
        if(item.sellIn<= 0) {
            decreaseQuality(item, 4);
        } else{
            decreaseQuality(item, 2);
        }
    }
}
