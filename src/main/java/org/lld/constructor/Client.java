package org.lld.constructor;

public class Client {
    public static void main(String[] args) {

        Employee emp = new Employee();

        System.out.println("Employee Name : "+emp.name);
        System.out.println("Employee Salary : "+emp.salary);

        Employee emp1 = new Employee("Shravan", 10000000);


        emp.name = "Shravan";
        emp.salary = 1000000;

        System.out.println("Employee Name : "+emp1.name);
        System.out.println("Employee Salary : "+emp1.salary);

        Department HR = new Department();
        HR.id = 1;
        HR.name = "HR";
        HR.budget = 500000;
        HR.noOfEmployees = 10;
        HR.startYear = 2022;
        HR.orgName = "CG";
        HR.ceo = "Allen";

        Department Fin = new Department(2, "Finance", 1000000, 15, 2019, "CG", "Arun");

        Department tech = new Department(Fin);
    }
}
