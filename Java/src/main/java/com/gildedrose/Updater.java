package com.gildedrose;

class Updater {

    void updateItem(Item item){
        updateQuality(item);
        updateSellIn(item);
        makeItemNotExceedMaximumQuality(item);
    }

    void updateQuality(Item item) {
        decreaseQuality(item);
        if (item.sellIn < 0) {
            decreaseQuality(item);
        }
    }

    private void makeItemNotExceedMaximumQuality(Item item) {
        if (item.quality < 0) {
            item.quality = 0;
        }
        if (item.quality > 50) {
            item.quality = 50;
        }
    }

    void increaseQuality(Item item) {
        increaseQuality(item, 1);
    }

    void increaseQuality(Item item, int amount) {
        item.quality = item.quality + amount;
    }

    private void decreaseQuality(Item item) {
        item.quality = item.quality - 1;
    }

    void decreaseQuality(Item item, int amount) {
        item.quality = item.quality - amount;
    }

    private void updateSellIn(Item item){
        item.sellIn = item.sellIn - 1;
    }

}
