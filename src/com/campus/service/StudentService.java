package com.campus.service;

import java.util.Arrays;

import com.campus.model.Student;

public class StudentService {
    public int calculateTotal(Student student) {
        if (student.getMarks() == null){
            return 0;
        }
        int total= 0;
        int[] marks=student.getMarks();
        for(int mark : marks){
            total += mark;
        }
        return total;
    }
    public double calculateAverage(Student student){
        if (student.getMarks() == null ){
            return 0.0;
        }
        int[] marks =student.getMarks();
        int total= calculateTotal(student);
         
        return (double)total/marks.length;
    }
    public int calculateMax(Student student){
        int[] marks = student.getMarks();
        int max =marks[0];
        for(int mark : marks){
            if(mark >max){
                max =mark;
            }
        }
        return max;
    }
    public int calculateMin(Student student){
        int[] marks = student.getMarks();
        int min =marks[0];
        for(int mark :marks){
        if(mark < min){
            min =mark;
            }
        }
        return min;

    }
    public String calculateGrade(Student student){
        double average = calculateAverage(student);
        return average < 30 ? "Fail" : average <50 ? "C": average >= 50 && average <=80 ?"B":average >= 80 && average <=100 ? "A":"invalid average";
    }
    public String passOrFail(Student student){
        double average = calculateAverage(student);
        return average < 30 ? "Fail":"Pass";
    }
    public void displayReportCard(Student student){
        System.out.println("Student Name" + student.getStudentname());
        System.out.println("Student Age" + student.getAge());
        System.out.println("Student Department" + student.getDepartment());
        System.out.println("Student Class" + student.getClass());
        System.out.println("Student Marks" + Arrays.toString(student.getMarks())); 
        System.out.println("Student average Mark" + calculateAverage(student));
        System.out.println("Student Grade" + calculateGrade(student));
        System.out.println("Student Max Mark" + calculateMax(student));
        System.out.println("Student Max MArk" + calculateMax(student));
        System.out.println("Pass Or File" + passOrFail(student));
    }
}