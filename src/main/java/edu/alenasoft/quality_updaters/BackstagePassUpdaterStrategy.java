package edu.alenasoft.quality_updaters;

import edu.alenasoft.Item;

public class BackstagePassUpdaterStrategy extends AbstractUpdaterStrategy {
    public BackstagePassUpdaterStrategy(Item item) {
        super(item);
    }

    @Override
    public void update() {
        increaseQuality();
        if (item.getSellIn() < 11) {
            increaseQuality();
        }
        if (item.getSellIn() < 6) {
            increaseQuality();
        }
        decreaseSellIn();
        if (item.getSellIn() < 0) {
            item.setQuality(0);
        }
    }
}
