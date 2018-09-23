package com;


public class Light {
    private Colour colour;
    private int time;
    private final int MINUTE = 6000;

    public Light() {
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        if (this.colour == null) {
            this.colour = colour;
        }
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time * MINUTE;
    }
}
