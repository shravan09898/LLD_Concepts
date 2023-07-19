package org.lld.staticnfinal;

public class Student {

    // final attribute
    final int id;       // id should be created when object is created and shouldn't be changed
    String name;
    int marks;

    //static Attribute
    static String schoolName;

    public Student(int id) {
        this.id = id;
    }

    //final method
    public final void attendInterview(){
        System.out.println("Hi, I'm a final method");
        System.out.println("Attend written test");
        System.out.println("Attend Interview");
        System.out.println("Attend HR");
        System.out.println("get Offer");
    }

    //static method

    public static void hello(){
        System.out.println("Hi, I'm a static method");
    }
}
