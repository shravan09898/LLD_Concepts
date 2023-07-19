package org.lld.inheritenceAndPolymorphism;

public class ValidationService {
    public boolean verifyemail(User user){
        String email = user.email;

        boolean ans = email==null?false:true;

        return ans;
    }


    //Runtime polymorphism - For method overriding
    public void validateLectureAttendance(User user){
        user.attendLecture();
        System.out.println(user+ " :  attended Lecture");
    }
}

//