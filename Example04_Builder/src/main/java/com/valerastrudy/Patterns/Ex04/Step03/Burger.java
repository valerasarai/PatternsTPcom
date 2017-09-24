package com.valerastrudy.Patterns.Ex04.Step03;

import com.valerastrudy.Patterns.Ex04.Step01.Item;
import com.valerastrudy.Patterns.Ex04.Step01.Packing;
import com.valerastrudy.Patterns.Ex04.Step02.Wrapper;

public abstract class Burger implements Item {

    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
