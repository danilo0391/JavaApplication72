/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Danilo
 */
public class Car {
    
    String maker;
    String color;
    int numberOfDoors;
    String engine;
    
    public Car(String maker, String color, int numberOfDoors, String engine){
        this.maker = maker;
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.engine = engine;
    }
    
    public void newCar(){
        
        System.out.println("This car was made by "+maker+", its color is "
                +color+", the number of doors is "+numberOfDoors+
                ", and the engine is "+engine);
    }
    
}
