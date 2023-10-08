package org.fasttrackit.course12.homework.exercise2and3.employee;

import org.fasttrackit.course12.homework.exercise2and3.person.Person;

public class Employee extends Person {
    private final String company;
    private final Integer salary;


    public Employee(String name, Integer age, String hairColor, String company, Integer salary) {
        super(name, age, hairColor);
        this.company = company;
        this.salary = salary;
    }
}
