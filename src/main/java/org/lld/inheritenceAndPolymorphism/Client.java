package org.lld.inheritence;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        student.id = 1;
        student.name = "Shravan";
        student.address = "Hyderabad";
        student.phone = "9063047208";
        student.email = "c_s_k@gmail.com";
        student.password = "**********";
        student.getDetails();

        TA ta = new TA();
        ta.id = 2;
        ta.name = "Sundeep";
        ta.address = "Bangalore";
        ta.phone = "9999900000";
        ta.email = "s_s_m@gmail.com";
        ta.password = "**********";
        ta.getDetails();
    }
}
