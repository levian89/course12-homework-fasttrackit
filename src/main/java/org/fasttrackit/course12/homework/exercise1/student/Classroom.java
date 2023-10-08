package org.fasttrackit.course12.homework.exercise1.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Integer.MIN_VALUE;

public class Classroom {
    private final List<Student> students;

    public Classroom(List<Student> students) {
        this.students = new ArrayList<>(students);
//        this.students = students;
    }

    public Map<String, Integer> mappingNameToGrade() {
        Map<String, Integer> nameToGrade = new HashMap<>();
        for (Student student : students) {
            nameToGrade.put(student.name(), student.grade());
        }
        return nameToGrade;
    }

    public Student getMaxGrade() {
        Student result = Student.builder()
                .grade(MIN_VALUE)
                .build();

        for (Student student : students) {
            if (student.grade() > result.grade()) {
                result = student;
            }
        }
        return result;
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
//        return students;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "students=" + students +
                '}';
    }
}
