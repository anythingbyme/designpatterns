package command.model;

import command.api.Command;


public class GarageDoorUpCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorUpCommand(final GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        System.out.println("execute");
        garageDoor.up();
    }
}
