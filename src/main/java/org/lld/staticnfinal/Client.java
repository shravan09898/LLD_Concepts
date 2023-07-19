package org.lld.staticnfinal;

public class Client {
    public static void main(String[] args) {

        Student s1 = new Student(1);
//        s1.id = 2;  //not possible because id is final and cant be able to change value of it
        Student s2 = new Student(3);
//        s2.id = 7;   //not possible to change as id is final

        System.out.println(s1.id+"   "+s2.id);
        Student.schoolName = "Vishnu High School";  //without creating or using object
        Student.hello();

        s1.attendInterview();

//        helloworld();   // cannot be used as main is static and helloworld is non static
        //inside static methods, we cannot call non-static methods
    }


    public void helloworld(){
        System.out.println("Hello World");
    }

}
