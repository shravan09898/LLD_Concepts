package org.lld.designpatterns.builder;

import org.lld.designpatterns.builder.exceptions.InvalidGradyearException;
import org.lld.designpatterns.builder.exceptions.InvalidNameException;
import org.lld.designpatterns.builder.exceptions.InvalidYOEException;
import org.lld.inheritenceAndPolymorphism.B;

import java.util.Map;

public class Student {
    private int id;
    private String name;
    private int yoe;
    private int gradYear;
    private double psp;
    private String batchName;

    private Student(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.yoe = builder.yoe;
        this.gradYear = builder.gradYear;
        this.psp = builder.psp;
        this.batchName = builder.batchName;
    }

    public static Builder builder(){
        Builder b = new Builder();
        return b;
    }

    public static class Builder {                 //helper Class
        public int id;
        private String name;     // name should not be null
        private int yoe;         // yoe>=1
        private int gradYear;    // gradyear<=2023
        private double psp;
        private String batchName;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setYoe(int yoe) {
            this.yoe = yoe;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setBatchName(String batchName) {
            this.batchName = batchName;
            return this;
        }

        public void validate(){
            if (name == null) {
                throw new InvalidNameException("Name can't be null");
            }
            if(yoe<1){
                throw new InvalidYOEException("YOE can't be less than 1");
            }
            if(gradYear>2023){
                throw new InvalidGradyearException("GradYear can't be of future ones");
            }
        }

        public Student build(){
            this.validate();
            Student s = new Student(this);
            return s;
        }
    }

}
