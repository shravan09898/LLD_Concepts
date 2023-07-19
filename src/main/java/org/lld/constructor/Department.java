package org.lld.constructor;

public class Department {
    int id;
    String name;
    int budget;
    int noOfEmployees;
    int startYear;
    String orgName;
    String ceo;

    public Department(){

    }

    public Department(int dId, String dName, int dBudget, int dNoOfEmp, int dStartYear, String dorgName, String dCeo){
        id = dId;
        name = dName;
        budget = dBudget;
        noOfEmployees = dNoOfEmp;
        startYear = dStartYear;
        orgName = dorgName;
        ceo = dCeo;
    }

    public Department(Department dept){
        id = dept.id+1;
        budget = dept.budget;
        noOfEmployees=dept.noOfEmployees;
        startYear = dept.startYear;
        orgName = dept.orgName;
        ceo = dept.ceo;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", budget=" + budget +
                ", noOfEmployees=" + noOfEmployees +
                ", startYear=" + startYear +
                ", orgName='" + orgName + '\'' +
                ", ceo='" + ceo + '\'' +
                '}';
    }
}
