package com.gildedrose;

class BackstagePassesUpdater extends Updater{

    @Override
    Item updateQuality(Item item) {
        if (item.getSellIn() <= 0) {
            return item.setQuality(0);
        } else if (item.getSellIn() <= 5) {
            return increaseQuality(item, 3);
        } else if (item.getSellIn() <= 10) {
            return increaseQuality(item, 2);
        } else {
            return increaseQuality(item, 1);
        }
    }

}
