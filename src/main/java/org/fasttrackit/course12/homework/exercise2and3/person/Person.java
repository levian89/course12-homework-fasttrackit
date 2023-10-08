package org.fasttrackit.course12.homework.exercise2and3.person;

public class Person {
    private final String name;
    private final Integer age;
    private final String hairColor;

    public Person(String name, Integer age, String hairColor) {
//        this(personBuilder.name, personBuilder.age, personBuilder.hairColor);
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getHairColor() {
        return hairColor;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hairColor='" + hairColor + '\'' +
                '}';
    }

    public static class PersonBuilder {
        private String name;
        private Integer age;
        private String hairColor;

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public PersonBuilder hairColor(String hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public Person build() {
            return new Person(name, age, hairColor);
        }
    }
}
