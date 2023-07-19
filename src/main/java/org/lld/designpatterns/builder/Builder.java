


// Entire class is nested inside Student class to avoid additional class creation


//package org.lld.designpatterns.builder;
//
//import org.lld.designpatterns.builder.exceptions.InvalidGradyearException;
//import org.lld.designpatterns.builder.exceptions.InvalidNameException;
//import org.lld.designpatterns.builder.exceptions.InvalidYOEException;
//
//public class Builder {                 //helper Class
//    public int id;
//    public String name;     // name should not be null
//    public int yoe;         // yoe>=1
//    public int gradYear;    // gradyear<=2023
//    public double psp;
//    public String batchName;
//
//    public Builder setId(int id) {
//        this.id = id;
//        return this;
//    }
//
//    public Builder setName(String name) {
//        this.name = name;
//        return this;
//    }
//
//    public Builder setYoe(int yoe) {
//        this.yoe = yoe;
//        return this;
//    }
//
//    public Builder setGradYear(int gradYear) {
//        this.gradYear = gradYear;
//        return this;
//    }
//
//    public Builder setPsp(double psp) {
//        this.psp = psp;
//        return this;
//    }
//
//    public Builder setBatchName(String batchName) {
//        this.batchName = batchName;
//        return this;
//    }
//
//    public void validate(){
//        if (name == null) {
//            throw new InvalidNameException("Name can't be null");
//        }
//        if(yoe<1){
//            throw new InvalidYOEException("YOE can't be less than 1");
//        }
//        if(gradYear>2023){
//            throw new InvalidGradyearException("GradYear can't be of future ones");
//        }
//    }
//
//    public Student build(){
//        this.validate();
//        Student s = new Student(this);
//        return s;
//    }
//}
