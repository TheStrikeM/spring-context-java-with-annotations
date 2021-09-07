package org.thestrikem.springapp.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

@Component
@Scope("prototype")
public class Race {
    private Car car1;
    private Car car2;

    @PostConstruct
    public void onInit() {
        System.out.println("Doing initialization...");
    }

    @PreDestroy
    public void onDestroy() {
        System.out.println("Doing destruction...");
    }

    @Autowired
    public Race(@Qualifier("teslaCar") Car car1,
                        @Qualifier("prioraCar") Car car2) {
        this.car1 = car1;
        this.car2 = car2;
    }

    public Car morePowerful() {
        if (this.car1.getHorsePower() < this.car2.getHorsePower()) return car2;
        else if (this.car1.getHorsePower() > this.car2.getHorsePower()) return car1;
        return null;
    }

    public void startTheRace() {
        int winner = new Random().nextInt(2);
        switch (winner) {
            case 0: {
                System.out.println("Winner is " + car1);
                break;
            }
            case 1: {
                System.out.println("Winner is " + car2);
                break;
            }
        }
        System.out.println("More powerful car is " + this.morePowerful());
    }
}
