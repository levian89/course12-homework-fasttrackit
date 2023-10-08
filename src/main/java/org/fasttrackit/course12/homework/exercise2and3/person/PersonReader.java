package org.fasttrackit.course12.homework.exercise2and3.person;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonReader {
    private final String inputFile;

    public PersonReader(String inputFile) {
        this.inputFile = inputFile;
    }

    public List<Person> readPersons() throws IOException {
        Scanner scanner = new Scanner(Path.of(inputFile));
        List<Person> persons = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            persons.add(buildPerson(line));
        }
        return persons;
    }

    private Person buildPerson(String line) {
        String[] tokens = line.split("[|]");
        return Person.builder()
                .name(tokens[0])
                .age(Integer.parseInt(tokens[1]))
                .hairColor(tokens[2])
                .build();
    }

    public String getInputFile() {
        return inputFile;
    }

}
