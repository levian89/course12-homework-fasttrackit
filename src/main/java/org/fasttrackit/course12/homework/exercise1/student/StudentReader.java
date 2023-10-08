package org.fasttrackit.course12.homework.exercise1.student;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader {
    private final String inputFile;

    public StudentReader(String inputFile) {
        this.inputFile = inputFile;
    }

    public List<Student> readStudents() throws IOException {
        Scanner scanner = new Scanner(Path.of(inputFile));
        List<Student> students = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            students.add(buildStudent(line));
        }

        return students;
    }

    private Student buildStudent(String line) {
        String[] tokens = line.split("[|]");
        return Student.builder()
                .name(tokens[0])
                .grade(Integer.parseInt(tokens[1]))
                .build();
    }

    public String getInputFile() {
        return inputFile;
    }
}
