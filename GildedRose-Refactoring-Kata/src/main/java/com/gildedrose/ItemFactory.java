package com.gildedrose;

public class ItemFactory {

    static ItemWrapper itemWrapper(Item item){

        switch (item.name){
            case "Aged Brie":
                return new BrieWrapper(item);

            case "Backstage passes to a TAFKAL80ETC concert":
                return new Backstage(item);

            case "Sulfuras, Hand of Ragnaros":
                return new Sulfuras(item);

            default:
                return new StandardItem(item);
        }

    }
}
