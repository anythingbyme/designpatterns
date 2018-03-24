package Factory.client;

import Factory.factory.SimplePizzafactory;
import Factory.model.ChkPizza;
import Factory.model.Pizza;
import Factory.model.ChessePizza;

public abstract class PizzaStore {



    /**
     *
     * design principle: open for extension, closed for modification
     * encapsulate object creation. in this case-pizz object creation
     * by having a factory create Pizza objects. how it helps: if there are multiple clients, then only one place to call
     * for pizza object creation
     *
     * Implementing an interface does not always mean, implements Interface. Having a super class could also mean implement
     * to an interface
     *
     * Factory Method Pattern gives us a way to encapsulate the instantiations of concrete types
     * Dependency Inversion Principle:
     * Depend upon abstractions. Do not depend upon concrete classes.
     * high-level components should not depend on our low-level components; rather, they should both depend on abstractions.
     * Ex: PizzaSore is a high-level component i.e pizzaStore.orderPizza("cheese");
     */

//    SimplePizzafactory simplePizzafactory;
//
//    public PizzaStore(final SimplePizzafactory simplePizzafactory) {
//        this.simplePizzafactory = simplePizzafactory;
//    }

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.bake();
        pizza.cut();
        pizza.boxIt();
        return pizza;
    }

    abstract Pizza createPizza(String type);


}
