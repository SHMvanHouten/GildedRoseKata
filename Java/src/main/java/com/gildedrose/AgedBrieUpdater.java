package com.gildedrose;


class AgedBrieUpdater extends Updater{

    void updateQuality(Item item){
        if(item.sellIn <= 0){
            increaseQuality(item,2);
        } else{
            increaseQuality(item);
        }
    }
}
