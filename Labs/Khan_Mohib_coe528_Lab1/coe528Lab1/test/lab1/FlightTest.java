/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mohib
 */
public class FlightTest {
    
    public FlightTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testConstructor() {
        Flight F = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        String expResult = "Flight 1030, Toronto to Kolkata, 03/02/99 7:50 pm, original price: 1000.0";
        int expCapacity = 500;
        String result = F.toString();
        assertEquals(expResult, result);
        assertEquals(expCapacity, F.capacity);
    }
    
    @Test
    public void testInvalidConstructor() {
        boolean test = false;
        try {
            Flight F = new Flight(1030, "Toronto", "Toronto", "03/02/99 7:50 pm", 500, 1000);
        }
        catch (IllegalArgumentException e) {
            test = true;
        }
        assertTrue(test);
    }
    
    @Test
    public void testGetFlightNumber() {
        Flight F = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        int expResult = 1030;
        int result = F.flightNumber;
        assertEquals(expResult, result);
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        Flight F = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        String expResult = "Toronto";
        String result = F.origin;
        assertEquals(expResult, result);
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        Flight F = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        String expResult = "Kolkata";
        String result = F.destination;
        assertEquals(expResult, result);
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
        Flight F = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        String expResult = "03/02/99 7:50 pm";
        String result = F.departureTime;
        assertEquals(expResult, result);
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        Flight F = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        int expResult = 1030;
        int result = F.flightNumber;
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
        Flight F = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        F.numberOfSeatsLeft = 50;
        int expResult = 50;
        int result = F.numberOfSeatsLeft;
        assertEquals(expResult, result);
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        Flight F = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        double expResult = 1000;
        double result = F.originalPrice;
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setFlightNumber method, of class Flight.
     */
    @Test
    public void testSetFlightNumber() {
        Flight F = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        F.setFlightNumber(99);
        int expResult = 99;
        int result = F.flightNumber;
        assertEquals(expResult, result);
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        Flight F = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        F.setOrigin("Toronto");
        String expResult = "Toronto";
        String result = F.origin;
        assertEquals(expResult, result);
    }

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        Flight F = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        F.setDestination("Kolkata");
        String expResult = "Kolkata";
        String result = F.destination;
        assertEquals(expResult, result);
    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
        Flight F = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        F.setDepartureTime("03/02/99 7:50 pm");
        String expResult = "03/02/99 7:50 pm";
        String result = F.departureTime;
        assertEquals(expResult, result);
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        Flight F = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        F.setCapacity(100);
        int expResult = 100;
        int result = F.capacity;
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetNumberOfSeatsLeft() {
        Flight F = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        F.setNumberOfSeatsLeft(5);
        int expResult = 5;
        int result = F.numberOfSeatsLeft;
        assertEquals(expResult, result);
    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
        Flight F = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        F.setOriginalPrice(2000);
        double expResult = 2000;
        double result = F.originalPrice;
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
        Flight F = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        F.numberOfSeatsLeft = 0;
        assertFalse(F.bookASeat());
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        Flight F = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        String expResult = "Flight 1030, Toronto to Kolkata, 03/02/99 7:50 pm, original price: 1000.0";
        String result = F.toString();
        assertEquals(expResult, result);
    }
    
}
