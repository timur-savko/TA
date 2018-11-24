package com.company.lab1;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        AverageMarkCounter markCounter = new AverageMarkCounter();

        ArrayList<Group> groups = new ArrayList<>();

        Group groupTmp;
        Student studentTmp;

        for (int i = 0; i < 5; i++) {
            groupTmp = new Group();
            for (int j = 0; j < 5; j++) {
                studentTmp = new Student("test" + j, "test" + j, new int[]{1 + j, 3 + j, 4 + j, 5 + j});
                groupTmp.addStudent(studentTmp);
            }
        }

        for (Group group : groups) {
            System.out.println("Group info:\n" + group.toString() + "\nGroup average mark: " + markCounter.count(group));
            System.out.println("________________________________________________________________________________");
        }

        System.out.println("\n\n\n");

        ArrayList<Student> students = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            studentTmp = new Student("test" + i, "test" + i, new int[]{1 + i, 3 + i, 4 + i, 5 + i});
            students.add(studentTmp);
        }

        for (Student student : students) {
            System.out.println("Student info: " + student.toString() + "\nStudent average mark: " + markCounter.count(student));
            System.out.println("________________________________________________________________________________");
        }


    }
}
