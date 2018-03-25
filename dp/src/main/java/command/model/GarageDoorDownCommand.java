package command.model;

import command.api.Command;

public class GarageDoorDownCommand implements Command {
    private GarageDoor garageDoor;

    @Override
    public void execute() {
        garageDoor.down();
    }

    public GarageDoorDownCommand(final GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
}
