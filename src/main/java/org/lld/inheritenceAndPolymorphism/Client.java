package org.lld.inheritenceAndPolymorphism;

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
        student.attendLecture("OOPs Polymorphism");
        student.attendLecture(102);

        TA ta = new TA();
        ta.id = 2;
        ta.name = "Sundeep";
        ta.address = "Bangalore";
        ta.phone = "9999900000";
        ta.email = "s_s_m@gmail.com";
        ta.password = "**********";
        ta.getDetails();

        //Polymorphism

        System.out.println();
        System.out.println("-----------------");
        System.out.println("String");
        System.out.println(100);
        System.out.println(109.08);
        System.out.println(189.2f);
        System.out.println(true);
        System.out.println('A');

        //Upcasting - Polymorphism in Inheritance

        User uStudent = new Student();
        User uMentor = new Mentor();
        User uTa = new TA();
        User uInstructor = new Instructor();

        ValidationService validationService = new ValidationService();
        System.out.println(validationService.verifyemail(uInstructor));
        System.out.println(validationService.verifyemail(uMentor));
        System.out.println(validationService.verifyemail(uTa));
        System.out.println(validationService.verifyemail(uStudent));

        Student student1 = new Student();
        student1.attendLecture();

        Instructor instructor1 = new Instructor();
        instructor1.attendLecture();

        Mentor mentor = new Mentor();
        mentor.attendLecture();

        TA ta1 = new TA();
        ta1.attendLecture();


        //Runtime polymorphism
        validationService.validateLectureAttendance(student1);
        validationService.validateLectureAttendance(instructor1);
        validationService.validateLectureAttendance(mentor);
        validationService.validateLectureAttendance(ta1);

        C c = new C(5, 10, 15);
        System.out.println(c.x);
        System.out.println(c.y);
         System.out.println(c.z);

         c.helloC();
    }
}
