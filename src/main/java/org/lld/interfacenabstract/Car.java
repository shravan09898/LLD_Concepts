package org.lld.interfacenabstract;

//Car is something that is comparable(speed or price), since we have implemented Comparable interface
public class Car implements Comparable<Car>{
    int speed;
    int price;

    public Car(int speed, int price) {
        this.speed = speed;
        this.price = price;
    }

    @Override       // showcases that the method is overridden, it has no logic/functionality in it
    public int compareTo(Car c) {
        return this.price-c.price;  //here this means current object, and c is the input car
    }
}
