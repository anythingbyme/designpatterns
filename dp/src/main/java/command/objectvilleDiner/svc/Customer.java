package command.objectvilleDiner.svc;

import command.api.Command;
import command.objectvilleDiner.api.ICook;
import command.objectvilleDiner.api.ICustomer;
import command.objectvilleDiner.api.IWaiter;

public class Customer implements ICustomer {
    private IWaiter waiter;
    private ICook cook;
    private Order order;


    @Override
    public void placeOrder() {
//        waiter.setOrder(new Order());this was my way of design
        waiter.orderUp();
//        cook.prepareFood(); this was my way of design
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(final Order order) {
        this.order = order;
    }

    public interface Order extends Command{}
}
