package com.gildedrose;

class GildedRose {
    private Item[] items;

    GildedRose(Item[] items) {
        this.items = items;
    }

    Item[] getItems() {
        return items;
    }

    void updateInventory() {
        Item[] updatedItemArray = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            Item item = updateItem(items[i]);
            updatedItemArray[i] = item;
        }
        items = updatedItemArray;
    }

    private Item updateItem(Item item) {

        switch (item.getName()) {
            case "Sulfuras, Hand of Ragnaros":
                return new LegendaryUpdater().updateItem(item);
            case "Aged Brie":
                return new AgedBrieUpdater().updateItem(item);
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePassesUpdater().updateItem(item);
            case "Conjured Mana Cake":
                return new ConjuredItemsUpdater().updateItem(item);
            default:
                return (new Updater().updateItem(item));
        }
    }

}