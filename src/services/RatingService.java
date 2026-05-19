package services;

import java.util.ArrayList;

import models.Room;

public class RatingService {

    CSVservice csv = new CSVservice();

    public void giveRating(
            ArrayList<Room> rooms,
            int roomNo,
            double rate
    ) {

        for (Room r : rooms) {

            if (r.getRoomNumber() == roomNo) {

                if (r.isBooked) {

                    System.out.println(
                            "Rating allowed only after checkout!"
                    );

                    return;
                }

                if (rate >= 1 && rate <= 5) {

                    r.rating = rate;

                    System.out.println(
                            "⭐ Thanks! Rating added: " + rate
                    );

                    csv.saveReview(roomNo, rate);
                }

                else {

                    System.out.println(
                            "Enter rating between 1–5 only!"
                    );
                }

                return;
            }
        }

        System.out.println("Room not found!");
    }
}