package com;

import java.util.Scanner;

/**
 * Назначение класса
 *
 * @author Администратор
 * @since 17.09.2018
 */
public class Light {
    private Colour colour;
    private int time;

    public Light() {

    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        if (this.colour == null){
            this.colour = colour;
        }
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time * 60000;
    }
}
