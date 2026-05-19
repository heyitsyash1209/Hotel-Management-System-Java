package models;

public class Room {

    private int roomNumber;
    public String roomType;
    private double pricePerNight;

    public boolean isBooked;
    public String customerName;
    public int daysBooked;
    public double rating;

    public Room(int roomNumber, String roomType, double pricePerNight) {

        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;

        this.isBooked = false;
        this.customerName = "";
        this.daysBooked = 0;
        this.rating = 0.0;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void showInfo() {

        System.out.println(
                "Room No: " + roomNumber +
                " | Type: " + roomType +
                " | Price: ₹" + pricePerNight +
                " | Booked: " + (isBooked ? "Yes" : "No") +
                " | Rating: " + (rating > 0 ? rating + "⭐" : "N/A")
        );
    }
}