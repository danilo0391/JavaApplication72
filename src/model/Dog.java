/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Person;
import model.Car;
import model.Dog;

/**
 *
 * @author Danilo
 */
public class Dog {

    String breed;
    String name;
    int age;

    public Dog(String breed, String name, int age) {
        this.breed = breed;
        this.name = name;
        this.age = age;
    }
    
    public void myDog(){
        if (age >= 10) {
            
            System.out.println("Your dog is getting old and needs special care.");
            System.out.println("Breed "+breed+", name "+name+", age "+age);
            
        } else{
            System.out.println("Breed "+breed+", name "+name+", age "+age);
        }
    }

}
