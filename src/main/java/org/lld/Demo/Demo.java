package org.lld.Demo;

import org.lld.encapsulation.Student;

public class Demo {
    public static void main(String[] args) {
        Student student = new Student();

        student.id = 1;
        student.marks = 100;
        student.name = "Shravan";

        System.out.println(student.id);
        System.out.println(student.marks);
        System.out.println(student.name);
    }
}
