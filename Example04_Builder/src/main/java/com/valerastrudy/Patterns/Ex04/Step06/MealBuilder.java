package com.valerastrudy.Patterns.Ex04.Step06;

import com.valerastrudy.Patterns.Ex04.Step04.ChickenBurger;
import com.valerastrudy.Patterns.Ex04.Step04.Coke;
import com.valerastrudy.Patterns.Ex04.Step04.Pepsi;
import com.valerastrudy.Patterns.Ex04.Step04.VegaBurger;
import com.valerastrudy.Patterns.Ex04.Step05.Meal;

public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegaBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
