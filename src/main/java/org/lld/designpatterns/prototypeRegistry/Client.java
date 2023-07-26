package org.lld.designpatterns.prototypeRegistry;

public class Client {
    public static void main(String[] args) {
        Student studentApr2023Proto = new Student();
        studentApr2023Proto.setBatchName("Apr_2023");;
        studentApr2023Proto.setAvgBatchPsp(82.29);
        studentApr2023Proto.setInstructorName("Sandeep");
        studentApr2023Proto.setName("04_23");
        studentApr2023Proto.setCurrModule("Backend_LLD_2");

        Student studentMar23Proto = new Student();
        studentMar23Proto.setBatchName("Mar23");
        studentMar23Proto.setAvgBatchPsp(90);
        studentMar23Proto.setInstructorName("Naman");
        studentMar23Proto.setMonthOfEnrollment("0323");
        studentMar23Proto.setCurrModule("DSA");

        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry.register("Apr_23",studentApr2023Proto);
        studentRegistry.register("Mar_23", studentMar23Proto);

        Student shravanApr2023 = studentRegistry.get("Apr_23").copy();
        shravanApr2023.setName("Shravan");
        shravanApr2023.setEmail("shravan_c@gmil.com");
        shravanApr2023.setPhoneNum("919059123654");

        Student pratyushApr23 = studentRegistry.get("Mar_23").copy();
        pratyushApr23.setName("Pratyush");
        pratyushApr23.setEmail("peatyush@email.com");
        pratyushApr23.setPhoneNum("1234");

        Student st = new IntelligentStudent("Jan23", 100);
        Student stCopy = st.copy();

    }
}
