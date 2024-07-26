package edu.alenasoft.quality_updaters;

import edu.alenasoft.Item;
import edu.alenasoft.interfaces.QualityUpdaterStrategy;

public abstract class AbstractUpdaterStrategy implements QualityUpdaterStrategy {

    Item item;

    public AbstractUpdaterStrategy(Item item) {
        this.item = item;
    }

    protected void decreaseQuality() {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }
    }

    protected void increaseQuality() {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
    }

    protected void decreaseSellIn() {
        item.setSellIn(item.getSellIn() - 1);
    }

}
