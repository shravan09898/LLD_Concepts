package org.lld.interfacenabstract;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<>();
        birds.add(new Crow());
        birds.add(new Sparrow());
        birds.add(new Penguin());

        for(Bird b : birds){
            b.breathe();
        }

        List<IFlyable> flyables = new ArrayList<>();
        flyables.add(new Crow());
        flyables.add(new Sparrow());

        for(IFlyable flyable : flyables){
            flyable.fly();
        }
    }
}
