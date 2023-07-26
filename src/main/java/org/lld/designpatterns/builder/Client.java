package org.lld.designpatterns.builder;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s = Student.builder()   //returns empty builder object
                .setId(sc.nextInt())               //sets id in builder object and returns the object itself
                .setName(sc.next())     //sets Name in builder object and returns the object itself
                .setYoe(sc.nextInt())              //sets YOE in builder object and returns the object itself
                .setGradYear(sc.nextInt())      //sets id GradYear builder object and returns the object itself
                .setPsp(sc.nextDouble())          //sets PSP in builder object and returns the object itself
                .setBatchName(sc.next())      //sets batchname in builder object and returns the object itself
                .build();               //will validate builder object and call student constructor and return student object

        System.out.println(s);
    }
}
