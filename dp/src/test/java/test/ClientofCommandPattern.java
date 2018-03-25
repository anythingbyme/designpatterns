package test;

import command.model.GarageDoor;
import command.model.GarageDoorDownCommand;
import command.model.GarageDoorUpCommand;
import command.model.Light;
import command.model.LightOffCommad;
import command.model.LightOnCommand;
import command.model.LivingRoomLightOffCommand;
import command.model.LivingRoomLightOnCommand;
import command.model.RemoteControl;
import command.model.TV;
import command.model.TvOffCommand;
import command.model.TvOnCommand;
import command.objectvilleDiner.svc.Cook;
import command.objectvilleDiner.svc.CookCommand;
import command.objectvilleDiner.svc.Waiter;
import org.junit.Test;

public class ClientofCommandPattern {

    @Test
    public void clientOfCommandPattern() {
        // RemoteControl is our invoker
        RemoteControl remoteControl = new RemoteControl();
        // client creates command object
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommad lightOffCommad = new LightOffCommad(new Light());
        // client sets command object on invoker
//        remoteControl.setSlot(lightOnCommand);
        remoteControl.setSlot(1, lightOnCommand, lightOffCommad);


        // client calls invoker
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
    }

    @Test
    public void clientOfDinerVilleUsingCommandPattern() {
        // client invokes Invoker i,e waiter
        Waiter waiter = new Waiter();
        // client creates Command object and passes receiver (cook) to command object
        CookCommand cookCommand = new CookCommand(new Cook());

        // client sets Command Object on invoker
        waiter.setOrder(cookCommand);

        // client calls invoker
        waiter.orderUp();
    }

    @Test
    public void clientOfGarageDoorAndTV() {
        //Invoker
        RemoteControl remoteControl = new RemoteControl();

        // client creates command
        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(new GarageDoor());
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(new GarageDoor());

        // client sets command on invoker
//        remoteControl.setSlot(garageDoorUpCommand);
        remoteControl.setSlot(2, garageDoorUpCommand, garageDoorDownCommand);

        // client invokes invoker
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);


        // client creates command object
        TvOnCommand tvOnCommand = new TvOnCommand(new TV());
        TvOffCommand tvOffCommand = new TvOffCommand(new TV());

        // client sets command on invoker
//        remoteControl.setSlot(tvOnCommand);
        // if we use lambdas , there wont be need to create *OnCommand, *OffCommand classes
//        remoteControl.setSlot(3, tvOnCommand, tvOffCommand); // this can also used with lambda. then no need to create TVOnCommand object
//        remoteControl.setSlot(3, ()-> new TV().on(), tvOffCommand); this can also be written using method reference
        remoteControl.setSlot(3, new TV()::on, tvOffCommand);

//        remoteControl.buttonWasPressed();
        remoteControl.onButtonWasPressed(3);
        remoteControl.offButtonWasPressed(3);
    }

    @Test
    public void clientOfLivingRoomLight() {
        // client creates invoker
        RemoteControl remoteControl = new RemoteControl();

        // client creates command object
        LivingRoomLightOnCommand livingRoomLightOnCommand = new LivingRoomLightOnCommand(new LivingRoomLightOnCommand.LivingRoom(new Light()));
        LivingRoomLightOffCommand livingRoomLightOffCommand = new LivingRoomLightOffCommand(new LivingRoomLightOnCommand.LivingRoom(new Light()));

        // client sets command object on invoker
//        remoteControl.setSlot(livingRoomLightOnCommand);

        remoteControl.setSlot(4, livingRoomLightOnCommand, livingRoomLightOffCommand);

//        remoteControl.buttonWasPressed();
        remoteControl.onButtonWasPressed(4);
        remoteControl.offButtonWasPressed(4);
    }
}