package command.objectvilleDiner.svc;

import command.api.Command;

public class CookCommand implements Command {

    private Cook cook; // receiver

    public CookCommand(final Cook cook) {
        this.cook = cook;
    }

    @Override
    public void execute() {
        System.out.println("execute");
        cook.prepareFood();
    }
}
