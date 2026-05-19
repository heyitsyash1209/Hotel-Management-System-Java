package services;

import models.Room;

public class BillingService {

    public void printBill(Room r, double discount, double total) {

        System.out.println("\n----- BILL -----");

        System.out.println(
                "Name: " + r.customerName
        );

        System.out.println(
                "Room No: " +
                r.getRoomNumber() +
                " (" + r.roomType + ")"
        );

        System.out.println(
                "Days: " + r.daysBooked
        );

        System.out.println(
                "Price/Night: ₹" +
                r.getPricePerNight()
        );

        if (discount > 0) {

            System.out.println(
                    "Discount (10%): ₹" + discount
            );
        }

        System.out.println(
                "Total: ₹" + total
        );

        System.out.println("----------------");
    }
}