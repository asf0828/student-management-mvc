package co.edu.umng.studentmanagement.view;

import co.edu.umng.studentmanagement.model.Student;

import java.util.List;

public class StudentView {

    public void showStudentList(List<Student> students) {
        System.out.println("Información de estudiantes:");
        for (Student student : students) {
            System.out.println(formatStudent(student));
        }
    }

    public void showYoungestStudent(Student student) {
        System.out.println();
        System.out.println("Estudiante con la Menor Edad:");
        System.out.println(formatStudent(student));
    }

    public void showOldestStudent(Student student) {
        System.out.println();
        System.out.println("Estudiante con la Mayor Edad:");
        System.out.println(formatStudent(student));
    }

    private String formatStudent(Student student) {
        return student.getName() + ", " + student.getAge() + " años, " + student.getSemester() + " semestre";
    }
}

