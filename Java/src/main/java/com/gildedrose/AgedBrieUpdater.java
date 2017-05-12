package com.gildedrose;


abstract class AgedBrieUpdater extends Updater{

    static void updateItem(Item item){
        updateQuality(item);
        updateSellIn(item);
        makeItemNotExceedMaximumQuality(item);
    }

    private static void updateQuality(Item item){
        if(item.sellIn <= 0){
            increaseQuality(item,2);
        } else{
            increaseQuality(item);
        }
    }
}
