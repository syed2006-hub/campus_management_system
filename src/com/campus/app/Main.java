package com.campus.app;

import com.campus.model.Student;
import com.campus.service.StudentService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student ID");
        int studentId = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter student name");
        String studentName = sc.nextLine();

        System.out.println("Enter student Age");
        int studentAge = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter student Department");
        String studentDept = sc.nextLine();

        System.out.println("Enter Number of subjects");
        int n = sc.nextInt();

        System.out.println("Enter the marks for " + n + " subjects");

        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the mark of subject " + (i + 1));
            marks[i] = sc.nextInt();
        }

        Student student = new Student(
                studentId,
                studentName,
                studentAge,
                studentDept,
                marks
        );

        student.displayStudentInfo(true);

        Student.displayStudentCount();

        StudentService ss = new StudentService();
        ss.displayReportCard(student);

        sc.close();
    }
}