/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author mohib
 */
public abstract class FoodComponent {
    public double price;
    public abstract double getPrice();
    public abstract void print(int level);
}
