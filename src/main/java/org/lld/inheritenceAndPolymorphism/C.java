package org.lld.inheritenceAndPolymorphism;

public class C extends B{
    int z;

    public C(int x, int y, int z){
        super(x, y);   //super calls the parent constructor of C, i.e,Constructor of B and passes the value of Y
        this.z = z;
    }

    public void helloC(){
        System.out.println("Hello World from C");
        helloB();    //class the overridden and will be printing 18th line of this class
        this.helloB();
        //If we want to print the method of parent class, we use super
        super.helloB();

        super.helloA();
        helloA();
    }

    public void helloB(){
        System.out.println("Hello World of B inside C class");
    }

    public void helloA(){
        System.out.println("Hello World of A inside C class");
    }
}
