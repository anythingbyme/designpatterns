package command.model;

import command.api.Command;

public class LivingRoomLightOffCommand implements Command {
    private LivingRoomLightOnCommand.LivingRoom livingRoom;

    public LivingRoomLightOffCommand(final LivingRoomLightOnCommand.LivingRoom livingRoom) {
        this.livingRoom = livingRoom;
    }

    @Override
    public void execute() {
        livingRoom.getLight().off();
    }
}
