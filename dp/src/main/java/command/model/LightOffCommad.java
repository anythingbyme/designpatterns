package command.model;

import command.api.Command;

public class LightOffCommad implements Command {
    private Light light;

    public LightOffCommad(final Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println(" light is off");
        light.off();
    }
}
