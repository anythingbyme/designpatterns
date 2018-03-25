package command.model;

import command.api.Command;

public class LivingRoomLightOnCommand implements Command {

    private LivingRoom livingRoom; // bind Receiver inside Command object

    public LivingRoomLightOnCommand(final LivingRoom livingRoom) {
        this.livingRoom = livingRoom;
    }

    @Override
    public void execute() {
        livingRoom.getLight().on();
    }

    public static class LivingRoom {
        private Light light;

        public LivingRoom(final Light light) {
            this.light = light;
        }

        public Light getLight() {
            return light;
        }

        public void setLight(final Light light) {
            this.light = light;
        }
    }
}
