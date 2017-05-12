package com.gildedrose;


public class AgedBrieUpdater extends Updater{

    static void updateItem(Item item){
        if(item.sellIn <= 0){
            increaseQuality(item,2);
        } else{
            increaseQuality(item);
        }
        updateSellIn(item);
    }
}
