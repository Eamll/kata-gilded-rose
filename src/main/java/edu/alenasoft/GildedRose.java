package edu.alenasoft;

import java.util.List;

import edu.alenasoft.interfaces.QualityUpdaterStrategy;
import edu.alenasoft.quality_updaters.BackstagePassUpdaterStrategy;
import edu.alenasoft.quality_updaters.ConjuredUpdaterStrategy;
import edu.alenasoft.quality_updaters.DefaultUpdaterStrategy;
import edu.alenasoft.quality_updaters.LegendaryUpdaterStrategy;

public class GildedRose {

  public static List<Item> items = null;

  public static void main(String[] args) {

    System.out.println("OMGHAI!");

    items.add(new Item("+5 Dexterity Vest", 10, 20));
    items.add(new Item("Aged Brie", 2, 0));
    items.add(new Item("Elixir of the Mongoose", 5, 7));
    items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
    items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
    items.add(new Item("Conjured Mana Cake", 3, 6));

    updateQuality();

    System.out.println(items);
  }

  public static void updateQuality() {
    for (Item item : items) {
      QualityUpdaterStrategy updater = createQualityUpdaterStrategy(item);
      updater.update();
    }
  }

  public static QualityUpdaterStrategy createQualityUpdaterStrategy(Item item) {
    switch (item.getName()) {
      case "Aged Brie":
        return new BackstagePassUpdaterStrategy(item);
      case "Backstage passes to a TAFKAL80ETC concert":
        return new BackstagePassUpdaterStrategy(item);
      case "Sulfuras, Hand of Ragnaros":
        return new LegendaryUpdaterStrategy(item);
      case "Conjured Mana Cake":
        return new ConjuredUpdaterStrategy(item);
      default:
        return new DefaultUpdaterStrategy(item);
    }
  }
}
