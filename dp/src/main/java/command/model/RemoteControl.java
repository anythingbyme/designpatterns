package command.model;

import command.api.Command;

// This is our Invoker
public class RemoteControl {
    // remote control has slots
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[10];
        offCommands = new Command[10];
    }

    public void onButtonWasPressed(final int slotIndex) {
        System.out.println("onButtonWasPressed");
        onCommands[slotIndex].execute();
    }

    public void offButtonWasPressed(final int slotIndex) {
        System.out.println("offButtonWasPressed");
        offCommands[slotIndex].execute();
    }

    public void setSlot(int slotIndex, final Command onCommand, final Command offCommand) {
        System.out.println("slot index="+ slotIndex + " is set");
        this.onCommands[slotIndex] = onCommand;
        this.offCommands[slotIndex] = offCommand;
    }
}
