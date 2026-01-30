package co.edu.umng.studentmanagement.runner;

import co.edu.umng.studentmanagement.controller.StudentController;
import co.edu.umng.studentmanagement.model.StudentRepository;
import co.edu.umng.studentmanagement.view.StudentView;

public class ApplicationRunner {

    /*
     * Integrantes del equipo:
     * - Alexander Sandoval. Código 200582
     */
    public static void main(String[] args) {
        StudentController controller = new StudentController(new StudentRepository(), new StudentView());
        controller.loadStudents();
        controller.displayStudentInformation();   
    }
}
