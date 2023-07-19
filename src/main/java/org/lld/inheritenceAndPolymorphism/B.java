package org.lld.inheritenceAndPolymorphism;

public class B extends A{
    int y;

    public B(int x, int y) {
        super(x);
        this.y = y;
    }

    public void helloB(){
        System.out.println("Hello World from B");
        this.helloA();
        super.helloA();
    }

    public void helloA(){
        System.out.println("Hello World of A inside B class");
    }
}