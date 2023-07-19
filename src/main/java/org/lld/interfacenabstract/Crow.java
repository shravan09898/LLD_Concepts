package org.lld.interfacenabstract;

public class Crow extends Bird implements IFlyable{

    public void fly() {
        System.out.println("Crow can fly");
    }
}
