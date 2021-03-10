package studentdatabaseapp;

import java.util.Scanner;

public class StudentDataBaseApp {

    public static void main(String[] args){
//        ask for amount of users to be added
        System.out.println("Enter amount of students enrolling: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        for(int i = 0; i < numOfStudents; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println( students[i].toString());
        }
    }
}
