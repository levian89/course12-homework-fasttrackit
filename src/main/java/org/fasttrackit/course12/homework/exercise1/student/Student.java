package org.fasttrackit.course12.homework.exercise1.student;

public record Student(
        String name,
        Integer grade
) {

    private Student(StudentBuilder studentBuilder) {
        this(studentBuilder.name, studentBuilder.grade);
    }

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    public static class StudentBuilder {
        private String name;
        private Integer grade;

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder grade(Integer grade) {
            this.grade = grade;
            return this;
        }

        public Student build() {
//            return new Student(this.name, this.grade);
            return new Student(this);
        }

    }
}
