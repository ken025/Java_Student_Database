package studentdatabaseapp;

import java.util.Scanner;

public class Student{
    private String firstName;
    private String lastName;
    private int semester;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costPerCourse = 600;
    private static int id = 1000;

//    constructor: prompt user to enter student's name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student's first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student's last name: ");
        this.lastName = in.nextLine();

        System.out.print("Enter student's semester: ");
        this.semester = in.nextInt();

//        System.out.print(firstName + " " + lastName + " is in semester " + semester);

        setID();

        System.out.print(firstName + " " + lastName + " " + semester + " " + studentID);
    }
//    Generate student's ID
    private void setID(){
        id++;
        this.studentID = semester + "" + id;
    }

//    Enroll in courses
    public void enroll(){
        do {
            System.out.println("Enter course to enroll: (Q to quit)");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costPerCourse;
            }else { break; }
        }while( 1 != 0); //infinite
        System.out.println("Enrolled in: " + courses);
        System.out.println("Tuition Balance: " + tuitionBalance);
    }

//    View Balance and pay tuition

//    Show status
}
