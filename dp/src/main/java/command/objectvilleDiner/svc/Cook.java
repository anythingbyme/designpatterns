package command.objectvilleDiner.svc;

import command.objectvilleDiner.api.ICook;

public class Cook implements ICook {

    @Override
    public void prepareFood() {
        System.out.println("prepareFood");
    }
}
