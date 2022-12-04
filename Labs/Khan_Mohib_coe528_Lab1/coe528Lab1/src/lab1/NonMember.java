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
public class NonMember extends Passenger {

    public NonMember(String name, int age) {
        super(name, age);
    }

    @Override
    public double applyDiscount(double p) {
        double finalPrice;
        if (age > 65) {
            finalPrice = p*0.9;
            return finalPrice;
        }
        else return p;
    }
    
}
