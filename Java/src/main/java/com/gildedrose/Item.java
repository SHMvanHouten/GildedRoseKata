package com.gildedrose;

public class Item {

    private final String name;

    private final int sellIn;

    private final int quality;

    Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public Item setQuality(int amount){
        return new Item(name, sellIn, amount);
    }

    public Item decreaseSellIn(){
        return new Item(name, sellIn -1, quality);
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
