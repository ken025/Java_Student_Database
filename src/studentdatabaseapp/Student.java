package studentdatabaseapp;

import java.util.Scanner;

public class Student{
    private String firstName;
    private String lastName;
    private int semester;
    private String studentID;
    private String courses;
    private int tuitionBalance;
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

//    View Balance and pay tuition

//    Show status
}
