package command.model;

import command.api.Command;

// This is our command object
public class TvOnCommand implements Command {

    private TV tv; // encapsulate receiver inside command

    public TvOnCommand(final TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        System.out.println("execute");
        tv.on();
    }
}
