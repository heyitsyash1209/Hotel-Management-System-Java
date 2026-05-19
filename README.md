# 🏨 Hotel Management System (Java)

A fully functional **terminal-based Hotel Management System** developed using **Core Java** and **Object-Oriented Programming (OOP)** concepts.  
This project simulates a real hotel booking environment where users can manage room reservations, billing, checkout, cancellation, ratings, and CSV-based data storage.

Designed with a modular structure using multiple packages and service classes for better scalability, readability, and maintainability.

---

# ✨ Features

## ✅ Room Management
- View available rooms
- Deluxe and Standard room categories
- Real-time booking status

## ✅ Booking System
- Book rooms using customer name and number of days
- Prevent duplicate bookings
- Dynamic bill generation

## ✅ Billing System
- Automatic bill calculation
- Price per night calculation
- Discount system for long stays

## ✅ Discount Feature
- 10% discount automatically applied for bookings above 3 days

## ✅ Checkout System
- Generate checkout bill
- Reset room after checkout

## ✅ Cancellation System
Special cancellation charges added based on booked days:

| Days Booked | Cancellation Charges |
|-------------|----------------------|
| 1 – 3 Days  | Rs. 200 |
| 4 – 6 Days  | Rs. 400 |
| 7 – 10 Days | Rs. 500 |
| Above 10    | Rs. 1000 |

---

## ✅ Rating & Review System
- Customers can rate rooms after checkout
- Rating range: 1–5 stars
- Review data stored permanently in CSV files

---

## ✅ CSV Data Storage
Project uses **CSV file handling** for lightweight data persistence.

### Stored Data:
- Booking History
- Customer Reviews & Ratings

### Files Used:
```text
data/booking.csv
data/Review.csv
```

---

# 🧠 OOP Concepts Used

This project demonstrates multiple important Java OOP concepts:

- Classes & Objects
- Encapsulation
- Inheritance
- Constructors
- ArrayList Collections
- Method Calling
- Modular Design
- File Handling

---

# 📂 Project Structure

```text
Hotel-management-system/
│
├── src/
│   ├── main/
│   │   └── HotelBooking.java
│   │
│   ├── models/
│   │   ├── Room.java
│   │   └── DeluxeRoom.java
│   │
│   └── services/
│       ├── Hotel.java
│       ├── BookingService.java
│       ├── BillingService.java
│       ├── RatingService.java
│       └── CSVservice.java
│
├── data/
│   ├── booking.csv
│   └── Review.csv
│
└── README.md
```

---

# ⚙️ Technologies Used

- Java
- VS Code
- Git & GitHub
- File Handling
- CSV Storage
- OOP Principles

---

# 🚀 How to Run the Project

## Step 1
Clone the repository:

```bash
git clone https://github.com/heyitsyash1209/Hotel-Management-System-Java.git
```

---

## Step 2
Open project in VS Code

---

## Step 3
Navigate to src folder:

```bash
cd src
```

---

## Step 4
Compile project:

```bash
javac models/*.java services/*.java main/*.java
```

---

## Step 5
Run project:

```bash
java main.HotelBooking
```

---

# 📸 Output Screenshots

## Main Menu
![Main Menu](screenshots/output1.png)

## Room Booking
![Booking](screenshots/output2.png)

## Checkout Bill
![Checkout](screenshots/output3.png)

## Rating System
![Rating](screenshots/output4.png)

---

# 🔥 Future Improvements

- Java Swing GUI
- Admin Login System
- MySQL Database Integration
- Customer History
- Online Payment Simulation
- Food Ordering System
- Room Availability Dashboard

---

# 👨‍💻 Developer

**Yash Gupta**

Gmail:
gyash4376@gmail.com

GitHub:  
https://github.com/heyitsyash1209

---

# ⭐ Project Status

✅ Completed  
✅ Modular Structure  
✅ CSV Integrated  
✅ GitHub Uploaded  
✅ OOP Concepts Implemented

---

# 🙌 Thank You

Thank you for checking out this project!  
If you found it useful, consider giving it a ⭐ on GitHub.
