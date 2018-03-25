package command.model;

import command.api.Command;

public class TvOffCommand implements Command {
    private TV tv;

    public TvOffCommand(final TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.off();
    }
}
