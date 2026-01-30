package co.edu.umng.studentmanagement.controller;

import co.edu.umng.studentmanagement.model.Student;
import co.edu.umng.studentmanagement.model.StudentRepository;
import co.edu.umng.studentmanagement.view.StudentView;

public class StudentController {

    private StudentRepository repository;
    private StudentView view;

    public StudentController(StudentRepository repository, StudentView view) {
        this.repository = repository;
        this.view = view;
    }

    public void loadStudents() {
        repository.addStudent(new Student("Ana María Robledo", 17, "IV"));
        repository.addStudent(new Student("Juan Francisco Quijano", 16, "II"));
        repository.addStudent(new Student("José Manuel Quintana", 19, "V"));
        repository.addStudent(new Student("María Patricia Bernal", 20, "IX"));
    }

    public void displayStudentInformation() {
        view.showStudentList(repository.getAllStudents());
        view.showYoungestStudent(repository.getYoungestStudent());
        view.showOldestStudent(repository.getOldestStudent());
    }
}
