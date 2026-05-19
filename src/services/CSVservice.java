package services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CSVservice {

    // SAVE BOOKING
    public void saveBooking(
            int roomNo,
            String name,
            int days
    ) {

        try {

            File file = new File(
                    "C:/Users/HP/Documents/Hotel-management-system/data/booking.csv"
            );

            FileWriter writer =
                    new FileWriter(
                            file,
                            true
                    );

            writer.write(
                    roomNo + "," +
                    name + "," +
                    days + "\n"
            );

            writer.flush();

            writer.close();

            System.out.println(
                    "welcome to the YG Peacewood Hotel!"
                    
            );
        }

        catch (IOException e) {

            System.out.println(
                    "Error saving booking!"
            );

            e.printStackTrace();
        }
    }

    // SAVE REVIEW
    public void saveReview(
            int roomNo,
            double rating
    ) {

        try {

            File file = new File(
                    "C:/Users/HP/Documents/Hotel-management-system/data/Review.csv"
            );

            FileWriter writer =
                    new FileWriter(
                            file,
                            true
                    );

            writer.write(
                    roomNo + "," +
                    rating + "\n"
            );

            writer.flush();

            writer.close();

            System.out.println(
                    "Thank you for your valuable review! We are happy to serve you and hope to welcome you again at our YG Peacewood hotel."
            );
        }

        catch (IOException e) {

            System.out.println(
                    "Error saving review!"
            );

            e.printStackTrace();
        }
    }
}