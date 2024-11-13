package com.gildedrose;

public class StandardItem implements ItemWrapper {
    Item item;

    public StandardItem(Item item) {
        this.item = item;
    }

    public void updateQuality() {
        if(item.sellIn > 0){
            item.quality = item.quality - 1;
        }
        else {
            item.quality = item.quality - 2;
        }

        if(item.quality < 0){
            item.quality = 0;
        }

        if(item.sellIn > 0){
            item.sellIn = item.sellIn - 1;
        }


    }
}
