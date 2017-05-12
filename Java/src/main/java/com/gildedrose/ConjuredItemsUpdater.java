package com.gildedrose;

class ConjuredItemsUpdater extends Updater{

    @Override
    void updateQuality(Item item) {
        if(item.sellIn<= 0) {
            decreaseQuality(item, 4);
        } else{
            decreaseQuality(item, 2);
        }
    }
}
