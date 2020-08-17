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
public class Person {

    String name;
    int age;
    double height;

    /**
     * Constructor
     */
    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void run() {

        System.out.println(name + " is running");
    }

}
