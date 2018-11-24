package com.company.lab1;


import java.util.ArrayList;

public class AverageMarkCounter {


    public double count(Group group) {
        if (group == null) {
            return -1;
        }

        double averageMarkSum = 0;
        double averageMarkQuantity = 0;
        ArrayList<Student> students = group.getStudents();
        for (Student student : students) {
            if (student.getMarks() != null) {
                for (int mark : student.getMarks()) {
                    averageMarkSum += mark;
                    averageMarkQuantity++;
                }
            }
        }

        if (averageMarkQuantity > 0) {
            double averageMark = averageMarkSum / averageMarkQuantity;
            return Math.rint(100.0 * averageMark) / 100.0;
        }

        return 0;
    }

    public double count(Student student) {
        if (student == null) {
            return -1;
        }

        double averageMarkSum = 0;
        double averageMarkQuantity = 0;

        if (student.getMarks() != null) {
            for (int mark : student.getMarks()) {
                averageMarkSum += mark;
                averageMarkQuantity++;
            }
        }

        if (averageMarkQuantity > 0) {
            double averageMark = averageMarkSum / averageMarkQuantity;
            return Math.rint(100.0 * averageMark) / 100.0;
        }

        return 0;
    }

}
