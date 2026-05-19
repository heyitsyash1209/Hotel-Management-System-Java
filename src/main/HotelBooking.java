package main;

import java.util.Scanner;

import services.Hotel;

public class HotelBooking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hotel hotel = new Hotel();

        int choice;

        System.out.println(
                " Welcome to The YG Peacewood Hotel "
        );

        System.out.println(
                " Experience Comfort & Peace "
        );

        do {

            System.out.println(
                    "\n HOTEL ROOM BOOKING SYSTEM "
            );

            System.out.println(
                    "1. Show Available Rooms"
            );

            System.out.println(
                    "2. Book a Room"
            );

            System.out.println(
                    "3. Checkout / Cancel Booking"
            );

            System.out.println(
                    "4. Show All Bookings"
            );

            System.out.println(
                    "5. Give Rating"
            );

            System.out.println(
                    "6. Exit"
            );

            System.out.print(
                    "Enter your choice: "
            );

            choice = sc.nextInt();

            switch (choice) {

                case 1 -> hotel.showAvailableRooms();

                case 2 -> {

                    System.out.print(
                            "Enter Room No: "
                    );

                    int rn = sc.nextInt();

                    sc.nextLine();

                    System.out.print(
                            "Enter Name: "
                    );

                    String name = sc.nextLine();

                    System.out.print(
                            "Enter Days: "
                    );

                    int days = sc.nextInt();

                    hotel.bookRoom(
                            rn,
                            name,
                            days
                    );
                }
               
               
               case 3 -> {

    System.out.println(
            " Enter option (1 = Cancel Full Booking, 2 = Cancel Only Booking):\n1. Checkout"
    );

    System.out.println(
            "2. Cancel Booking"
    );

    int option = sc.nextInt();

    System.out.print(
            "Enter Room No: "
    );

    int rn = sc.nextInt();
   
    if (option == 1) {

        hotel.cancelBooking(rn);
    }

    else if (option == 2) {

        hotel.cancelOnlyBooking(rn);
    }

    else {

        System.out.println(
                "Invalid Option!"
        );
    }
}

                case 4 -> hotel.showBookings();

                case 5 -> {

                    System.out.print(
                            "Enter Room No to Rate: "
                    );

                    int rn = sc.nextInt();

                    System.out.print(
                            "Enter Rating (1–5): "
                    );

                    double rate = sc.nextDouble();

                    hotel.giveRating(rn, rate);
                }

                case 6 -> System.out.println(
                        "Thank you for choosing The YG Peacewood Hotel!"
                );

                default -> System.out.println(
                        "Invalid choice!"
                );
            }

        } while (choice != 6);

        sc.close();
    }
}