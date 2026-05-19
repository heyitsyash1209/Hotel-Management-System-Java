package services;

import java.util.ArrayList;

import models.Room;
import models.DeluxeRoom;

public class Hotel {

    ArrayList<Room> rooms = new ArrayList<>();

    BookingService bookingService =
            new BookingService();

    RatingService ratingService =
            new RatingService();

    public Hotel() {

        rooms.add(new DeluxeRoom(101, 2500));
        rooms.add(new DeluxeRoom(102, 2700));

        rooms.add(new Room(201, "Standard", 1500));
        rooms.add(new Room(202, "Standard", 1500));
        rooms.add(new Room(203, "Standard", 1500));
        rooms.add(new Room(204, "Standard", 1500));
    }

    public void showAvailableRooms() {

        System.out.println(
                "\n--- Available Rooms ---"
        );

        boolean found = false;

        for (Room r : rooms) {

            if (!r.isBooked) {

                r.showInfo();

                found = true;
            }
        }

        if (!found) {

            System.out.println(
                    "No rooms available right now!"
            );
        }
    }

    public void showBookings() {

        System.out.println(
                "\n--- Current Bookings ---"
        );

        boolean found = false;

        for (Room r : rooms) {

            if (r.isBooked) {

                System.out.println(
                        "Room " +
                        r.getRoomNumber() +
                        " | " +
                        r.customerName +
                        " | Days: " +
                        r.daysBooked
                );

                found = true;
            }
        }

        if (!found) {

            System.out.println(
                    "No active bookings!"
            );
        }
    }

    public void bookRoom(
            int roomNo,
            String name,
            int days
    ) {

        bookingService.bookRoom(
                rooms,
                roomNo,
                name,
                days
        );
    }

    public void cancelBooking(int roomNo) {

        bookingService.cancelBooking(
                rooms,
                roomNo
        );
    }
    public void cancelOnlyBooking(int roomNo) {

    bookingService.cancelOnlyBooking(
            rooms,
            roomNo
    );
}

    public void giveRating(
            int roomNo,
            double rate
    ) {

        ratingService.giveRating(
                rooms,
                roomNo,
                rate
        );
    }
}