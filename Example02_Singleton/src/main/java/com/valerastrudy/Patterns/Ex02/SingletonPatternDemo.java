package com.valerastrudy.Patterns.Ex02;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        //illegal construct
        //Compile time Error: The Constructor SingleObject() is not visible
        //SingleObject singleObject = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();

        //Show the message
        object.showMessage();
    }
}
