/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication72;

import model.Person;
import model.Car;
import model.Dog;

/**
 *
 * @author Danilo
 */
public class JavaApplication72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Person p1 = new Person("Danilo", 35, 1.77);
        p1.run();

        Person p2 = new Person("Peter", 35, 1.77);
        p2.run();

        Car c1 = new Car("Fiat", "Red", 5, "Diesel");
        c1.newCar();

        Car c2 = new Car("Volvo", "Black", 3, "Petrol");
        c2.newCar();

        Dog d1 = new Dog("Dalmata", "Google", 10);
        d1.myDog();
        
        Dog d2 = new Dog("Husk", "Android", 5);
        d2.myDog();
    }

}
