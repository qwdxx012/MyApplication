package com.example.myapplication;

public class Helper {
    private String name = "Helper";
    private FefDebug debug = new FefDebug();

    public void printName() {
        debug.log(name);
    }
}
