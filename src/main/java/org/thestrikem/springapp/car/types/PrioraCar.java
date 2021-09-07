package org.thestrikem.springapp.car.types;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.thestrikem.springapp.car.Car;

@Component
public class PrioraCar implements Car {
    private String engine = "Priora Electronic Engine v1";
    private String model = "Priora X";

    @Value("${priora.horsePower}")
    private int horsePower;

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public String getEngine() {
        return engine;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void run() {
        System.out.println(
                String.format("The car %s - %s was launched with %s", "Priora", this.model, this.engine)
        );
    }

    @Override
    public String toString() {
        return "PrioraCar{" +
                "engine='" + engine + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
