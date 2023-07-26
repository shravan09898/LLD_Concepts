package org.lld.designpatterns.prototypeRegistry;

public class Student {
    private String batchName;
    private double avgBatchPsp;
    private String instructorName;
    private String monthOfEnrollment;
    private String currModule;
    private String name;
    private String phoneNum;
    private String email;

    public Student() {
    }

    public Student(String batchName) {
        this.batchName = batchName;
    }

    public Student copy(){
        Student student = new Student();
        student.name = this.name;
        student.avgBatchPsp = this.avgBatchPsp;
        student.batchName = this.batchName;
        student.instructorName = this.instructorName;
        student.monthOfEnrollment = this.monthOfEnrollment;
        student.currModule = this.currModule;

        return student;
    }

    public Student(String batchName, double avgBatchPsp, String instructorName,
                   String monthOfEnrollment, String currModule, String name,
                   String phoneNum, String email) {
        this.batchName = batchName;
        this.avgBatchPsp = avgBatchPsp;
        this.instructorName = instructorName;
        this.monthOfEnrollment = monthOfEnrollment;
        this.currModule = currModule;
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getMonthOfEnrollment() {
        return monthOfEnrollment;
    }

    public void setMonthOfEnrollment(String monthOfEnrollment) {
        this.monthOfEnrollment = monthOfEnrollment;
    }

    public String getCurrModule() {
        return currModule;
    }

    public void setCurrModule(String currModule) {
        this.currModule = currModule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
