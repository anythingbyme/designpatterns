package Factory.client;

import Factory.factory.ChicagoPizzafactory;
import Factory.model.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    private ChicagoPizzafactory chicagoPizzafactory;

    public ChicagoPizzaStore(final ChicagoPizzafactory chicagoPizzafactory) {
        this.chicagoPizzafactory = chicagoPizzafactory;
    }

    Pizza createPizza(final String type) {
        return chicagoPizzafactory.createPizza(type);
    }
}
