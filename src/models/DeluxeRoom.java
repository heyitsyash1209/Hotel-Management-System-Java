package models;

public class DeluxeRoom extends Room {

    String extraFacility;

    public DeluxeRoom(int roomNumber, double pricePerNight) {

        super(roomNumber, "Deluxe", pricePerNight);

        this.extraFacility = "AC, TV, Wi-Fi";
    }

    public void showFacility() {

        System.out.println(
                "Facilities: " + extraFacility
        );
    }
}