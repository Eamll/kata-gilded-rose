package edu.alenasoft.quality_updaters;

import edu.alenasoft.Item;

public class DefaultUpdaterStrategy extends AbstractUpdaterStrategy {
    public DefaultUpdaterStrategy(Item item) {
        super(item);
    }

    @Override
    public void update() {
        decreaseQuality();
        decreaseSellIn();
        if (item.getSellIn() < 0) {
            decreaseQuality();
        }
    }
}
