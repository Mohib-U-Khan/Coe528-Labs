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
import java.util.Vector;

public class FoodCategory extends FoodComponent{
    private String name;
    private Vector<FoodComponent> components;
    
    public FoodCategory(String name) {
        this.name = name;
        components = new Vector<FoodComponent>();
    }
    
    public void add(FoodComponent c) {
        components.addElement(c);
    }
    
    public void remove(FoodComponent c) {
        components.removeElement(c);
    }
    
    public double getPrice() {
        int j;
        double sum=0;
        for(j=0;j<components.size();j++) {
            if (components.get(j) instanceof FoodItem) {
                sum = sum + components.get(j).price;
            }
            else if (components.get(j) instanceof FoodCategory) {
                sum = sum + components.get(j).getPrice();
            }
        }
        return sum;
    }
    
    public void print(int level) {
        int i;
        for (i=0;i<level; i++) {
            System.out.print("\t");
        }
        System.out.println("FoodCategory (" + name + ", " + this.getPrice() + ") contains:");
        int j;
        for(j=0;j<components.size();j++) {
            components.get(j).print(level+1);
            }
        }
    }

