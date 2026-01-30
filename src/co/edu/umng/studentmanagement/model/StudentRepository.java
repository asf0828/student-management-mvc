package co.edu.umng.studentmanagement.model;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private List<Student> students;
    
    public StudentRepository() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public List<Student> getAllStudents() {
        return this.students;
    }

    public Student getYoungestStudent() {
        Student youngest = students.get(0);

        for (Student student : students) {
            if (student.getAge() < youngest.getAge()) {
                youngest = student;
            }
        }

        return youngest;
    }

    public Student getOldestStudent() {
        Student oldest = students.get(0);

        for (Student student : students) {
            if (student.getAge() > oldest.getAge()) {
                oldest = student;
            }
        }

        return oldest;
    }
}
