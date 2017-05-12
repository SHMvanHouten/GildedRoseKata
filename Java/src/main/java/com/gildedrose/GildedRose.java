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
                LegendaryUpdater.updateItem(item);
                break;
            case "Aged Brie":
                AgedBrieUpdater.updateItem(item);
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                BackstagePassesUpdater.updateItem(item);
                break;
            case "Soulstone":
                ConjuredItemsUpdater.updateItem(item);
                break;
            default:
                Updater.updateItem(item);
                break;
        }
    }
}