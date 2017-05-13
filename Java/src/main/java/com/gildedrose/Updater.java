package com.gildedrose;


class Updater {

    Item updateItem(Item item){
        item = updateQuality(item);
        item = updateSellIn(item);
        item = makeItemNotExceedMaximumQuality(item);
        return item;
    }

    Item updateQuality(Item item) {
        if(item.getSellIn() <= 0){
            return decreaseQuality(item, 2);
        } else{
            return decreaseQuality(item);
        }
    }

    private Item makeItemNotExceedMaximumQuality(Item item) {
        if (item.getQuality() < 0) {
            item = item.setQuality(0);
        }
        if (item.getQuality() > 50) {
            item = item.setQuality(50);
        }
        return item;
    }

    Item increaseQuality(Item item) {
        return increaseQuality(item, 1);
    }

    Item increaseQuality(Item item, int amount) {
        return item.setQuality(item.getQuality() + amount);
    }

    private Item decreaseQuality(Item item) {
        return decreaseQuality(item, 1);
    }

    Item decreaseQuality(Item item, int amount) {
        return item.setQuality(item.getQuality() - amount);
    }

    private Item updateSellIn(Item item){
        return item.decreaseSellIn();
    }

}
