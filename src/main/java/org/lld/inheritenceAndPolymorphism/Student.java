package org.lld.inheritenceAndPolymorphism;

public class Student extends User {

    // Child class extends parent class

    double psp;
    double attendance;

    // Total attributes = Attributes of User class(6) + attributes from Student class(2) => 8

    public void attendLecture(String str){                //attendLecture(String)
        System.out.println("Please join Lecture : "+str);
    }

    public void attendLecture(int lectureNum){                //attendLecture(int)
        System.out.println("Please join Lecture : "+lectureNum);
    }

    public void attendLecture(){
        System.out.println("Student is learning from the lecture");
    }
}
