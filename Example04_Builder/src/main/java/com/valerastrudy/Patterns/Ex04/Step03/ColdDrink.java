package com.valerastrudy.Patterns.Ex04.Step03;

import com.valerastrudy.Patterns.Ex04.Step01.Item;
import com.valerastrudy.Patterns.Ex04.Step01.Packing;
import com.valerastrudy.Patterns.Ex04.Step02.Bottle;

public abstract class ColdDrink implements Item {

    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
