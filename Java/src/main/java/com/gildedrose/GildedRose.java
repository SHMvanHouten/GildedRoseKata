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

        if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            LegendaryUpdater.updateItem(item);
        } else {
            switch (item.name) {
                case "Aged Brie":
                    AgedBrieUpdater.updateItem(item);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    updateBackstagePasses(item);
                    break;
                default:
                    Updater.updateItem(item);
                    break;
            }

            if (item.quality < 0) {
                item.quality = 0;
            }
            if (item.quality > 50) {
                item.quality = 50;
            }
        }

    }


    private void updateBackstagePasses(Item item) {
        if (item.sellIn <= 0) {
            item.quality = 0;
        } else if (item.sellIn <= 5) {
            increaseQuality(item, 3);
        } else if (item.sellIn <= 10) {
            increaseQuality(item, 2);
        } else {
            increaseQuality(item, 1);
        }
    }


    private void decreaseQuality(Item item) {
        item.quality = item.quality - 1;
    }

    private void increaseQuality(Item item) {
        increaseQuality(item, 1);
    }
    private void increaseQuality(Item item, int i) {
        item.quality = item.quality + i;
    }

}