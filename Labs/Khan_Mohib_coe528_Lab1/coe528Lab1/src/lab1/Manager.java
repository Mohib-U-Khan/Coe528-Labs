/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author mohib
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Manager {
    ArrayList<Flight> Flights = new ArrayList<Flight>();
    ArrayList<Ticket> Tickets = new ArrayList<Ticket>();
    public void createFlights(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the Flight Number:");
        int flightNumber = in.nextInt();
        in.nextLine();
        System.out.println("Please enter the Origin of the flight:");
        String origin = in.nextLine();
        System.out.println("Please enter the Destination of the flight:");
        String destination =  in.nextLine();
        System.out.println("Please enter the Departure Time of the flight(mm/dd/yy ##pm):");
        String departureTime = in.nextLine();
        System.out.println("Please enter the flight Capacity:");
        int capacity = in.nextInt();
        System.out.println("Please enter the flight Price:");
        double originalPrice = in.nextDouble();
        System.out.println("Please enter the number of Available Seats on the flight:");
        int numberOfSeatsLeft = in.nextInt();
        Flight f = new Flight(flightNumber, origin, destination, departureTime, capacity, originalPrice);
        f.numberOfSeatsLeft = numberOfSeatsLeft;
        Flights.add(f);
        System.out.println("Flight was created successfully!\n\n\n");
    }
    
    public Flight getFlight(int flightNumber){
        for (int num =0; num<Flights.size(); num++) {
            if (flightNumber == Flights.get(num).flightNumber) {
                return Flights.get(num);
            }
        }return null;
    }
    
    public void bookSeat(int flightNumber, Passenger p) {
        Flight f = getFlight(flightNumber);
        if (f == null) {
            System.out.println("Flight not found.\n\n");
        }
        else {
        f.bookASeat();
        double price = p.applyDiscount(f.originalPrice);
        Ticket t = new Ticket(p, f, price);
        Tickets.add(t);
        System.out.println("Flight booked successfully.\nYour total cost will be: "+t.getPrice());
        }
    }
    
    public void displayAvailableFlights(String origin, String destination){
        for (int num =0; num<Flights.size(); num++) {
            if (origin.equals(Flights.get(num).origin) && destination.equals(Flights.get(num).destination) && Flights.get(num).numberOfSeatsLeft>0){
                Flight f = Flights.get(num);
                String s = f.toString();
                System.out.println("Flights found:");
                System.out.println(s);
                System.out.println("\n\n\n");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Flight Booking System!");
        System.out.println("There are currently no flights in the database.");
        System.out.println("Please create a new flight.");
        Manager m = new Manager();
        m.createFlights();
        while (true){
        System.out.println("Enter 'D' to diplay all available flights, 'B' to book a seat on a flight, 'C' to create a new flight, or 'E' to end.");
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        if (x.toUpperCase().equals("C")) {
            m.createFlights();
        }
        else if (x.toUpperCase().equals("B")) {
            System.out.println("Please enter your name:");
            String name = in.nextLine();
            System.out.println("Please enter your age:");
            int age = in.nextInt();
            in.nextLine();
            Passenger p;
            while (true) {
                System.out.println("Do you have a membership? (Y/N)");
                String y = in.nextLine();
                if (y.toUpperCase().equals("Y")) {
                    p = new Member(name,age);
                    System.out.println("How many years have you been a member?");
                    int num = in.nextInt();
                    in.nextLine();
                    p.setYearsOfMembership(num);
                    break;
                }
                else if (y.toUpperCase().equals("N")) {
                    p = new NonMember(name,age);
                    break;
                }
                else {
                    System.out.println("Please enter Y for yes or N for no.");

                }
            }
            System.out.println("Please enter the Flight Number:");
            int flightNumber = in.nextInt();
            in.nextLine();
            m.bookSeat(flightNumber, p);
        }
        else if (x.toUpperCase().equals("D")) {
            System.out.println("Enter the origin of the flight you are looking for:");
            String origin = in.nextLine();
            System.out.println("Enter the destinaiton of the flight you are looking for:");
            String destination = in.nextLine();
            m.displayAvailableFlights(origin, destination);
        }
        else if (x.toUpperCase().equals("E")) {
            break;
        }
        else System.out.println("Please enter a valid input.\n");
      }
    }
}
