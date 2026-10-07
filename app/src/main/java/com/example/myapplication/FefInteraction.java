package com.example.myapplication;

public class FefInteraction {
    private final Fef fef;

    public FefInteraction(Fef fef) {
        this.fef = fef;
    }

    public void click() {
        fef.increase();
    }
}
