package com.gildedrose;


class AgedBrieUpdater extends Updater{

    @Override
    Item updateQuality(Item item){
        if(item.getSellIn() <= 0){
            return increaseQuality(item,2);
        } else{
            return increaseQuality(item);
        }
    }
}
