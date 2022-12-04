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
public class FoodItem extends FoodComponent{
    private String name;
    
    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public void print(int level) {
        int i;
        for (i=0;i<level; i++) {
            System.out.print("\t");
        }
        System.out.println("FoodItem: " + name + ", " + price);
    }
}