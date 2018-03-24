package Factory.factory;

import Factory.model.ChessePizza;
import Factory.model.ChkPizza;
import Factory.model.Pizza;

public class SimplePizzafactory {
    public Pizza createPizza(String type) {
        Pizza pizza;
        if("cheese".equalsIgnoreCase(type)) {
            pizza = new ChessePizza();
        }
        else if("chicken".equalsIgnoreCase(type)) {
            pizza = new ChkPizza();
        }
        else if("pepporoni".equalsIgnoreCase(type)) {
            pizza = new ChkPizza();
        }
        else
            throw new RuntimeException(String.format("Unknown pizza type=%s", type));
        return pizza;
    }
}
