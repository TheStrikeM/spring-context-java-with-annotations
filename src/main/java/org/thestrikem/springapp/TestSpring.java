package org.thestrikem.springapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.thestrikem.springapp.car.Race;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfiguration.class
        );

        Race race = context.getBean("race", Race.class);
        race.startTheRace();

        context.close();
    }
}
