package org.fasttrackit.course12.homework.exercise1.main;

import org.fasttrackit.course12.homework.exercise1.student.Classroom;
import org.fasttrackit.course12.homework.exercise1.student.Student;
import org.fasttrackit.course12.homework.exercise1.student.StudentReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Student student1 = Student.builder().name("Bla").grade(10).build();
        System.out.println(student1);
        System.out.println("**************************");

        StudentReader reader = new StudentReader("files/input/students.txt");
        List<Student> students = reader.readStudents();
        for (Student student : reader.readStudents()) {
            System.out.println(student);
        }
        System.out.println("**************************");


        Classroom classroom = new Classroom(students);

        students.add(Student.builder().name("Bla").grade(20).build());
        System.out.println(students);
        System.out.println("**************************");


        Map<String, Integer> nameToGradeMap = classroom.mappingNameToGrade();
        System.out.println("Students mapped name to grade, are: ");
        System.out.println(nameToGradeMap);
        for (Map.Entry<String, Integer> entry : nameToGradeMap.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("**************************");



        System.out.println("Student with the highest grade: " + classroom.getMaxGrade());
    }
}
