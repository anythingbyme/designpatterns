package command.objectvilleDiner.svc;

import command.api.Command;
import command.objectvilleDiner.api.IWaiter;

// waiter is invoker.
public class Waiter  {
    public Command order; // it needs command object

    public void orderUp() {
        System.out.println("orderUp");
        order.execute();  // invoker invokes execute
    }

    public void setOrder(final Command order) {
        System.out.println("setOrder");
        this.order = order;
    }
}
