package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Назначение класса
 *
 * @author Администратор
 * @since 16.09.2018
 */
class TrafficLight {
    private List<Light> lights;

    TrafficLight() {
        init();
    }

    private void init() {
        Scanner sc = new Scanner(System.in);
        lights = new ArrayList<>();
        for (int i = 0; i <Colour.values().length; i++) {
            Light light = new Light();
            light.setColour(Colour.values()[i]);
            System.out.println("Введите время действия для " + Colour.values()[i] + " света в минутах");
            light.setTime(sc.nextInt());
            lights.add(light);
        }
    }

    public void launch(){
        try {
            for (Light light : lights) {
                System.out.println("Горит " + light.getColour() + " свет");
                Thread.sleep(light.getTime());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
