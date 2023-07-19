package org.lld.designpatterns.builder;

import java.util.HashMap;
import java.util.Objects;

public class Client {
    public static void main(String[] args) {
        Student s = Student.builder()   //returns empty builder object
                .setId(1)               //sets id in builder object and returns the object itself
                .setName("Shravan")     //sets Name in builder object and returns the object itself
                .setYoe(4)              //sets YOE in builder object and returns the object itself
                .setGradYear(2019)      //sets id GradYear builder object and returns the object itself
                .setPsp(82.29)          //sets PSP in builder object and returns the object itself
                .setBatchName("May_2022 Beginner")      //sets batchname in builder object and returns the object itself
                .build();               //will validate builder object and call student constructor and return student object

        System.out.println(s);
    }
}
