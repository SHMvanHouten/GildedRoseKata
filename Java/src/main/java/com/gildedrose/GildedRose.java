package com.gildedrose;

class GildedRose {
    private Item[] items;

    GildedRose(Item[] items) {
        this.items = items;
    }

    void updateInventory() {
        for (Item item : items) {
            updateItem(item);
        }
    }

    private void updateItem(Item item) {

        switch (item.name) {
            case "Sulfuras, Hand of Ragnaros":
                new LegendaryUpdater().updateItem(item);
                break;
            case "Aged Brie":
                new AgedBrieUpdater().updateItem(item);
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                new BackstagePassesUpdater().updateItem(item);
                break;
            case "Soulstone":
                new ConjuredItemsUpdater().updateItem(item);
                break;
            default:
                new Updater().updateItem(item);
                break;
        }
    }
}