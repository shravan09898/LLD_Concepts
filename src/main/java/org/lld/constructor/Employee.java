package org.lld.constructor;

public class Employee {
    String name;   //Default value of String is null
    int salary;    //Default value of Integer is 0-Zero


     // --No-Arg Constructor

    public Employee(){
        name = "Arun";
        salary = 5000000;
    }


    /*
    --Default Constructor

    public Employee(){
    }
     */

    // Parameterized constructor

    public Employee(String empName, int empSalary){
        name = empName;
        salary = empSalary;
    }
}
