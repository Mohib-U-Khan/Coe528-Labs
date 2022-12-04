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
public class Member extends Passenger {
    public int yearsOfMembership;

    public Member(String name, int age) {
        super(name, age);
    }

    @Override
    public double applyDiscount(double p){
        double finalPrice;
        if (yearsOfMembership > 5) {
            finalPrice = p*0.5;
            return finalPrice;
        }
        else if (yearsOfMembership <= 5 && yearsOfMembership > 1) {
            finalPrice = p*0.9;
            return finalPrice;
        } 
        else return p;
    } 
    
}
