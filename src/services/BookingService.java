package services;

import java.util.ArrayList;

import models.Room;

public class BookingService {

    BillingService billing = new BillingService();
    CSVservice csv = new CSVservice();

    // BOOK ROOM
    public void bookRoom(
            ArrayList<Room> rooms,
            int roomNo,
            String name,
            int days
    ) {

        for (Room r : rooms) {

            if (r.getRoomNumber() == roomNo) {

                if (r.isBooked) {

                    System.out.println(
                            "Room already booked!"
                    );

                    return;
                }

                r.isBooked = true;
                r.customerName = name;
                r.daysBooked = days;

                double total =
                        r.getPricePerNight() * days;

                double discount = 0;

                if (days > 3) {

                    discount = total * 0.10;

                    total -= discount;

                    System.out.println(
                            "\n🎉 10% Discount Applied!"
                    );
                }

                System.out.println(
                        "\nRoom booked for " + name
                );

                billing.printBill(r, discount, total);
                csv.saveBooking(roomNo, name, days);

                return;
            }
        }

        System.out.println("Room not found!");
    }

    // CHECKOUT
    public void cancelBooking(
            ArrayList<Room> rooms,
            int roomNo
    ) {

        for (Room r : rooms) {

            if (r.getRoomNumber() == roomNo) {

                if (r.isBooked) {

                    double total =
                            r.getPricePerNight()
                            * r.daysBooked;

                    double discount =
                            (r.daysBooked > 3)
                                    ? total * 0.10
                                    : 0;

                    total -= discount;

                    System.out.println(
                            "\nCheckout Bill:"
                    );

                    billing.printBill(
                            r,
                            discount,
                            total
                    );

                    r.isBooked = false;
                    r.customerName = "";
                    r.daysBooked = 0;

                    System.out.println(
                            "Checkout successful!"
                    );
                    

                    return;
                }

                else {

                    System.out.println(
                            "Room not booked yet!"
                    );

                    return;
                }
            }
        }

        System.out.println("Room not found!");
    }

    // CANCEL BOOKING
    public void cancelOnlyBooking(
            ArrayList<Room> rooms,
            int roomNo
    ) {

        for (Room r : rooms) {

            if (r.getRoomNumber() == roomNo) {

                if (!r.isBooked) {

                    System.out.println(
                            "Room not booked!"
                    );

                    return;
                }

                int charges = 0;

                if (r.daysBooked >= 1
                        && r.daysBooked <= 3) {

                    charges = 200;
                }

                else if (r.daysBooked <= 6) {

                    charges = 400;
                }

                else if (r.daysBooked <= 10) {

                    charges = 500;
                }

                else {

                    charges = 1000;
                }

                System.out.println(
                        "\nBooking Cancelled!"
                );

                System.out.println(
                        "Cancellation Charges: ₹"
                        + charges
                );

                r.isBooked = false;
                r.customerName = "";
                r.daysBooked = 0;

                return;
            }
        }

        System.out.println("Room not found!");
    }
}