command pattern

encapsulate method invocation
object invoking the computation doesn't need to know abt how things are done

project: design api for home automation remote control.
The remote control features seven programmable slots (each can be assigned to a different household device) along with corresponding on/off buttons for each.
The remote also has a global undo button.

create an API for programming the remote so that each slot can be assigned to control a device or set of devices.
Note that it is important that we be able to control the current devices on the disc, and also any future devices that the vendors may supply.

My notes:
remotecontrol
    slot1 - tv
    slot2 - ac
    slot3 - printer
    slot4 - refrigerator
    slot5 - microwave
    slot6 -
    slot7 -
    global undo -

    trunon tv, turn off tv

    RemoteControl
        List<Slot> slots;
        Slot getSlot(id);
        reset() {

            slots = null;
        }
        // assign device to slot
        assign(Device, Slot);
        pressButton(Slot id);

    Slot implements Control
        id;
        name;
        List<Device>;
        State;


    enum State {
        ON, OFF;
    }

    Control
        turnOn();
        turnOff();

    Device
        id;
        name;

Command Pattern allows you to decouple the requester of an action from the object that actually performs the action.
here the requester would be the remote control and the object that performs the action would be an instance of one of your vendor classes.

Objectviller diner:
cutomer: placeOrder
waiter: submit order to cook
cook: prepareOrder

all command objects implement the same interface, which consists of one method. In the Diner we called this method orderUp(); however, we typically just use the name execute().


