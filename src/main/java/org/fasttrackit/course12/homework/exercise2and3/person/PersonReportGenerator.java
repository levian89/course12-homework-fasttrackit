package org.fasttrackit.course12.homework.exercise2and3.person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonReportGenerator {
    private final List<Person> persons;

    public PersonReportGenerator(List<Person> persons) {
        this.persons = new ArrayList<>(persons);
    }

    public List<String> getPersonsNames() {
        List<String> personsNames = new ArrayList<>();
        for (Person person : persons) {
            personsNames.add(person.getName());
        }
        return personsNames;
    }

    public Map<String, Integer> mappingNameToAge() {
        Map<String, Integer> nameToAge = new HashMap<>();
        for (Person person : persons) {
            nameToAge.put(person.getName(), person.getAge());
        }
        return nameToAge;
    }

    public List<Person> getPersonsOlderThan(Integer age) {
        List<Person> personsOlderThan = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() > age) {
                personsOlderThan.add(person);
            }
        }
        return personsOlderThan;
    }

    public Map<String, List<String>> groupByHairColor() {
        Map<String, List<String>> hairToNameMap = new HashMap<>();
        for (Person person : persons) {
            List<String> listOfNames = hairToNameMap.get(person.getHairColor());
            if (listOfNames == null) {
                List<String> personsName = new ArrayList<>();
                personsName.add(person.getName());
                hairToNameMap.put(person.getHairColor(), personsName);
            } else {
                listOfNames.add(person.getName());
            }
        }
        return hairToNameMap;
    }

    public Map<Integer, List<Person>> groupByAge() {
        Map<Integer, List<Person>> ageToPersonsMap = new HashMap<>();
        for (Person person : persons) {
            List<Person> personList = ageToPersonsMap.get(person.getAge());
            if (personList == null) {
                List<Person> people = new ArrayList<>();
                people.add(person);
                ageToPersonsMap.put(person.getAge(), people);
            } else {
                personList.add(person);
            }
        }
        return ageToPersonsMap;
    }

    public List<Person> getPersons() {
        return new ArrayList<>(persons);
    }

    @Override
    public String toString() {
        return "PersonReportGenerator{" +
                "persons=" + persons +
                '}';
    }
}
