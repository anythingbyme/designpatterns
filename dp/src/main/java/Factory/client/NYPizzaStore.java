package Factory.client;

import Factory.factory.NYPizzaFactory;
import Factory.factory.SimplePizzafactory;
import Factory.model.Pizza;

public class NYPizzaStore extends PizzaStore {

    private NYPizzaFactory nyPizzaFactory;

    public NYPizzaStore(final NYPizzaFactory nyPizzaFactory) {
        this.nyPizzaFactory = nyPizzaFactory;
    }

    @Override
    Pizza createPizza(final String type) {
        return nyPizzaFactory.createPizza(type);
    }
}
