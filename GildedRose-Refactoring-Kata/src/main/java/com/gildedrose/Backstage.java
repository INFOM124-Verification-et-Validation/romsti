package com.gildedrose;

public class Backstage implements ItemWrapper{

    Item item;

    public Backstage(Item item) {
        this.item = item;
    }

    public void updateQuality() {

        if(item.sellIn < 0) {
            item.quality = 0;
        } else if(item.sellIn < 6) {
            item.quality = item.quality + 3;
        } else if(item.sellIn < 11) {
            item.quality = item.quality + 2;
        }

        if(item.quality > 50){
            item.quality = 50;
        }

        item.sellIn = item.sellIn - 1;
    }
}
