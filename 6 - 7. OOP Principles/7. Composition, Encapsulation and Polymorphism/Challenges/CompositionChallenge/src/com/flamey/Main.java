package com.flamey;

// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class
// like you saw in this video.

public class Main {

    public static void main(String[] args)
    {
        Wall wall1 = new Wall(5,5, "North");
        Wall wall2 = new Wall(5,5, "South");
        Wall wall3 = new Wall(5,5, "East");
        Wall wall4 = new Wall(5,5, "West");

        Ceiling ceiling = new Ceiling(5,5);

        Bed bed = new Bed(2, 3, 300.99, "Modern");

        Desk desk = new Desk("Old-school");

        Room room = new Room(wall1, wall2, wall3, wall4, ceiling, bed, desk, new Lamp("Modern", false, 60));
        room.getLamp().turnOn();
        room.makeBed();
    }
}
