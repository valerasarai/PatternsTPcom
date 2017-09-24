package com.valerastrudy.Patterns.Ex02;

public class SingleObject {

    //create object of SingleObject
    private static SingleObject instance = new SingleObject();

    //make the constructor private so that this class cannot be instantiated
    private SingleObject(){};

    //Get the only one object available
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("This message in from SingleObject class!!!!");
    }
}
