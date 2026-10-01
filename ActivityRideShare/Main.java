package ActivityRideShare;
import java.util.Scanner;

//Passenger
class Passenger {
    String name; //attributes of the passenger
    String phone;
}

//Driver
class Driver {
    String name; //attributes of the driver
    String vehicleBrand;
    String routeTaken;  
    int minutesPerKm;   
    double farePerKm;  //Better cars cost more.

    void showInfo() {
        System.out.println(name + " | " + vehicleBrand + " | Rate: PHP " + farePerKm + "/km");
    }
}

//RideRequest
class RideRequest {
    Passenger passenger;
    Driver driver;       
    String pickup;
    String dropoff;
    int distanceKm;    
    double totalFare;
    double bayad;      
    int travelTime;    
    boolean isCompleted;

    void calculateDetails() { // formula lang para sa bayad 
        travelTime = distanceKm * driver.minutesPerKm; 
        totalFare = distanceKm * driver.farePerKm;
        
        System.out.println("=== TRIP COMPUTATION ===");
        System.out.println("Driver: " + driver.name + " (" + driver.vehicleBrand + ")");
        System.out.println("Distance: " + distanceKm + " km");
        System.out.println("Estimated Time: " + travelTime + " minutes");
        System.out.println("TOTAL FARE: PHP " + totalFare);
    }

    void completeRide() { //nababa na passenger
        isCompleted = true;
        System.out.println("=== RIDE COMPLETED ===");
        System.out.println(passenger.name + " has arrived at " + dropoff + "!");
        System.out.println("Route taken: " + driver.routeTaken);
        System.out.println("Total Travel Time: " + travelTime + " minutes.");
        System.out.println("Change / Sukli: PHP " + (bayad - totalFare));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //mga drivers na koolpal
        Driver d1 = new Driver();
        d1.name = "Ryan Rems";
        d1.vehicleBrand = "Toyota Vios (Standard)";
        d1.routeTaken = "Inner City Traffic Roads";
        d1.minutesPerKm = 3; 

        d1.farePerKm = 15.0;

        Driver d2 = new Driver();
        d2.name = "Muman Reyes";
        d2.vehicleBrand = "Honda Civic (Fast)";
        d2.routeTaken = "Main Highways";
        d2.minutesPerKm = 2; 
        d2.farePerKm = 25.0;

        Driver d3 = new Driver();
        d3.name = "Boss Roger Naldo";
        d3.vehicleBrand = "Lamborghini (Super Fast)";
        d3.routeTaken = "Skyway / Expressways";
        d3.minutesPerKm = 1; 
        d3.farePerKm = 50.0; // Most Expensive

        //PASSENGER INPUT
        Passenger myPassenger = new Passenger();
        
        System.out.println("=== WELCOME TO RIDE-SHARE ===");
        System.out.print("Enter Passenger Name: ");
        myPassenger.name = scan.nextLine();
        
        //Phone Number Validation, para lang hindi maka input yunf user ng napakaraming numbers
        boolean validPhone = false;
        while (!validPhone) {
            System.out.print("Enter Phone Number (Must be 11 digits): ");
            String inputPhone = scan.nextLine();
            
            if (inputPhone.length() == 11) {
                myPassenger.phone = inputPhone;
                validPhone = true; 
            } else {
                System.out.println("[Error] Invalid phone number length. Please try again.");
            }
        }

        //RIDE REQUEST 
        RideRequest myRide = new RideRequest();
        myRide.passenger = myPassenger; 
        
        System.out.print("Enter Pickup Location: ");
        myRide.pickup = scan.nextLine();
    
        //DESTINATIONS MENU 
        System.out.println("=== SELECT DESTINATION ===");
        System.out.println("[1] SM North EDSA (10 km)");
        System.out.println("[2] Makati CBD (25 km)");
        System.out.println("[3] NAIA Terminal 3 Airport (40 km)");
        System.out.print("Choose destination (1-3): ");
        int destChoice = scan.nextInt();
        
        if (destChoice == 1) {
            myRide.dropoff = "SM North EDSA";
            myRide.distanceKm = 10;
        } else if (destChoice == 2) {
            myRide.dropoff = "Makati CBD";
            myRide.distanceKm = 25;
        } else if (destChoice == 3) {
            myRide.dropoff = "NAIA Terminal 3 Airport";
            myRide.distanceKm = 40;
        } else {
            System.out.println("Invalid choice. Defaulting to SM North EDSA.");
            myRide.dropoff = "SM North EDSA";
            myRide.distanceKm = 10;
        }

        //DRIVER SELECTION
        System.out.println("=== AVAILABLE DRIVERS ===");
        System.out.print("[1] "); d1.showInfo();
        System.out.print("[2] "); d2.showInfo();
        System.out.print("[3] "); d3.showInfo();
        System.out.print("Choose your driver (1-3): ");
        
        int driverChoice = scan.nextInt();
        
        if (driverChoice == 1) {
            myRide.driver = d1;
        } else if (driverChoice == 2) {
            myRide.driver = d2;
        } else if (driverChoice == 3) {
            myRide.driver = d3;
        } else {
            System.out.println("Invalid choice. Defaulting to Kuya Cardo.");
            myRide.driver = d1;
        }

        //CALCULATE FARE AND ASK FOR PAYMENT
        myRide.calculateDetails(); 
        
        boolean validPayment = false;
        while (!validPayment) {
            System.out.print("Enter your payment amount (PHP): ");
            double inputPayment = scan.nextDouble();
            
            if (inputPayment >= myRide.totalFare) {
                myRide.bayad = inputPayment;
                System.out.println("Payment accepted!");
                validPayment = true;
            } else {
                System.out.println("[Error] Insufficient payment! You need PHP " + (myRide.totalFare - inputPayment) + " more.");
            }
        }
        
        myRide.completeRide();
        scan.close();
    }
}