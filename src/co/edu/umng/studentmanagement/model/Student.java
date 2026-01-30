package co.edu.umng.studentmanagement.model;

public class Student {

    private String name;
    private int age;
    private String semester;

    public Student(String name, int age, String semester) {
        this.name = name;
        this.age = age;
        this.semester = semester;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSemester() {
        return semester;
    }

}
