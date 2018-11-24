package com.company.lab1;

import java.util.Arrays;
import java.util.Objects;

public class Student {

    private static int currentId = 1;

    private final int id;

    private String surname;

    private String name;

    private Group group;

    private int[] marks;

    public Student(String surname, String name, int[] marks) {
        this.id = currentId++;
        this.surname = surname;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group getGroup() {
        return group;
    }

    void setGroup(Group group) {
        this.group = group;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o.getClass() != Student.class) return false;
        Student student = (Student) o;
        return id == student.id &&
                group.equals(student.group) &&
                surname.equals(student.surname) &&
                name.equals(student.name) &&
                Arrays.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, surname, name, group);
        result = 31 * result + Arrays.hashCode(marks);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
