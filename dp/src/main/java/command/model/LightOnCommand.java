package command.model;

import command.api.Command;

public class LightOnCommand implements Command {
    private Light light; // pass receiver

    public LightOnCommand(final Light light) {
        this.light = light;
        System.out.println("light added to LightOnCommand");
    }

    @Override
    public void execute() {
        System.out.println("execute");
        this.light.on();
    }
}
