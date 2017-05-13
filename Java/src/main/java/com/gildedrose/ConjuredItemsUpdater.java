package com.gildedrose;

class ConjuredItemsUpdater extends Updater{

    @Override
    Item updateQuality(Item item) {
        if(item.getSellIn()<= 0) {
            return decreaseQuality(item, 4);
        } else{
            return decreaseQuality(item, 2);
        }
    }
}
