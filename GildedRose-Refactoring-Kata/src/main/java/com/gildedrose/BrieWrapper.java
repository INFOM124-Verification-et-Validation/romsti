package com.gildedrose;

public class BrieWrapper implements ItemWrapper {

    Item item;

    public BrieWrapper(Item item) {
        this.item = item;
    }


    public void updateQuality() {
        if (item.quality < 50){
            item.quality++;
        }
        item.sellIn = item.sellIn - 1;
    }
}
