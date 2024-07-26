package edu.alenasoft.quality_updaters;

import edu.alenasoft.Item;

public class ConjuredUpdaterStrategy extends AbstractUpdaterStrategy {

    public ConjuredUpdaterStrategy(Item item) {
        super(item);
    }

    @Override
    public void update() {
        decreaseQuality();
        decreaseQuality();
        decreaseSellIn();
        if (item.getSellIn() < 0) {
            decreaseQuality();
            decreaseQuality();
        }
    }
}
