package org.lld.interfacenabstract;

public class Sparrow extends Bird implements IFlyable{
    @Override
    public void fly() {
        System.out.println("Sparrow can fly");
    }
}
