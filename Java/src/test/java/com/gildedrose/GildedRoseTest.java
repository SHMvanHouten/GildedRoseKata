package com.gildedrose;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void agedBrieIncreaseInQuality() throws Exception {

        Item item = new Item("Aged Brie", 2, 0);
        updateItem(item);
        assertThat(item.quality, is(1));

    }

    @Test
    public void agedBrieIncreaseInTwiceAsFastAfterTheSellIn() throws Exception {

        Item item = new Item("Aged Brie", -5, 0);
        updateItem(item);
        assertThat(item.quality, is(2));

    }

    @Test
    public void agedBrieWithSellIn1WillIncrease1() throws Exception {
        Item item = new Item("Aged Brie", 1, 0);
        updateItem(item);
        assertThat(item.quality, is(1));
    }

    @Test
    public void agedBrieWithSellIn0WillIncrease2() throws Exception {
        Item item = new Item("Aged Brie", 0, 0);
        updateItem(item);
        assertThat(item.quality, is(2));
    }

    @Test
    public void agedBrieShouldNotIncreaseBeyond50() throws Exception {
        Item item = new Item("Aged Brie", -5, 49);
        updateItem(item);
        assertThat(item.quality, is(50));
    }

    @Test
    public void agedBrieShouldGetAnUpdateSellIn() throws Exception {
        Item item = new Item("Aged Brie", -5, 49);
        updateItem(item);
        assertThat(item.sellIn, is(-6));
    }

    @Test
    public void sulfurasShouldNeverChange() throws Exception {

        Item item = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
        updateItem(item);
        assertThat(item.quality, is(80));
        assertThat(item.sellIn, is(0));

    }

    @Test
    public void backstagePassesIncreaseInQuality() throws Exception {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 20);
        updateItem(item);
        assertThat(item.quality, is(21));
    }

    @Test
    public void backstagePassesIncreaseInQualityAtADoubleRateWithin10DaysOfSellIn() throws Exception {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20);
        updateItem(item);
        assertThat(item.quality, is(22));
    }

    @Test
    public void backstagePassesIncreaseInQualityAtATripleRateWithin5DaysOfSellIn() throws Exception {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20);
        updateItem(item);
        assertThat(item.quality, is(23));
    }

    @Test
    public void qualityOfBackstagePassesWillNotExceed49() throws Exception {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49);
        updateItem(item);
        assertThat(item.quality, is(50));
    }

    @Test
    public void backstagePassesLoseTheirQualityAfterSellin() throws Exception {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20);
        updateItem(item);
        assertThat(item.quality, is(0));
    }

    @Test
    public void normalItemsDecreaseInQuality() throws Exception {
        Item item = new Item("+5 Dexterity Vest", 10, 20);
        updateItem(item);
        assertThat(item.quality, is(19));
    }

    @Test
    public void qualityOfNormalDecreaseTwiceAsFastAfterSellin() throws Exception {
        Item item = new Item("+5 Dexterity Vest", -1, 20);
        updateItem(item);
        assertThat(item.quality, is(18));
    }



    @Test
    public void sellInDateShouldDecreaseByOneEachDay() throws Exception {
        Item item = new Item("+5 Dexterity Vest", 10, 20);
        updateItem(item);
        assertThat(item.sellIn, is(9));
    }

    @Test
    public void conjuredItemsShouldDegradeInQualityTwiceAsFast() throws Exception {
        Item item = new Item("Soulstone", 10, 20);
        updateItem(item);
        assertThat(item.quality, is(18));
    }

    @Test
    public void conjuredItemsShouldDegradeByFourAtNegativeSellIn() throws Exception {
        Item item = new Item("Soulstone", -1, 20);
        updateItem(item);
        assertThat(item.quality, is(16));
    }

    private void updateItem(Item item) {
        Item[] items = new Item[] {item};
        GildedRose app = new GildedRose(items);
        app.updateInventory();
    }
}
