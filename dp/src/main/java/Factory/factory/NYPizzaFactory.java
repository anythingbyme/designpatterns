package Factory.factory;

import Factory.model.Pizza;

public class NYPizzaFactory {
    private SimplePizzafactory simplePizzafactory;

    public Pizza createPizza(String type) {
        return simplePizzafactory.createPizza(type);
    }
}
