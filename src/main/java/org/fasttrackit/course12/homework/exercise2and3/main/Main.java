package org.fasttrackit.course12.homework.exercise2and3.main;

import org.fasttrackit.course12.homework.exercise2and3.person.Person;
import org.fasttrackit.course12.homework.exercise2and3.person.PersonReader;
import org.fasttrackit.course12.homework.exercise2and3.person.PersonReportGenerator;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Person person1 = Person.builder().build();
        System.out.println(person1);
        System.out.println("**************************");

        PersonReader reader = new PersonReader("files/input/persons.txt");
        List<Person> persons = reader.readPersons();
        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println("**************************");

        PersonReportGenerator reportGenerator = new PersonReportGenerator(persons);
        System.out.println(reportGenerator.getPersonsNames());
        System.out.println("**************************");

        System.out.println(reportGenerator.mappingNameToAge());
        System.out.println("**************************");

        Map<String, Integer> nameToAgeMap = reportGenerator.mappingNameToAge();
        for (Map.Entry<String, Integer> entry : nameToAgeMap.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("**************************");

        List<Person> personsOlderThan = reportGenerator.getPersonsOlderThan(35);
        System.out.println("Persons older than given age, are: ");
        for (Person person : personsOlderThan) {
            System.out.println(person);
        }
        System.out.println("**************************");

        System.out.println("Persons grouped by hair color, are: ");
        System.out.println(reportGenerator.groupByHairColor());
        System.out.println("**************************");

        Map<String, List<String>> hairColorToNameMap = reportGenerator.groupByHairColor();
        System.out.println("Persons grouped by hair color, are: ");
        for (Map.Entry<String, List<String>> entry : hairColorToNameMap.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("**************************");

        System.out.println("Persons grouped by age, are: ");
        System.out.println(reportGenerator.groupByAge());
        System.out.println("**************************");

        Map<Integer, List<Person>> ageToPersonsMap = reportGenerator.groupByAge();
        System.out.println("Persons grouped by age, are: ");
        for (Map.Entry<Integer, List<Person>> entry : ageToPersonsMap.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("**************************");
    }
}
