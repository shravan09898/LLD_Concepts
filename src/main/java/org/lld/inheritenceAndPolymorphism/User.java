package org.lld.inheritenceAndPolymorphism;

public class User {
    int id;
    String name;
    String phone;
    String address;
    String email;
    String password;

    public void getDetails(){
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Phone Num : "+phone);
        System.out.println("Address : "+address);
        System.out.println("Email ID : "+email);
        System.out.println("Password : "+password);
    }

    public void attendLecture(){
        System.out.println("User is attending lecture");
    }
}
