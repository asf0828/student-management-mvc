package co.edu.umng.studentmanagement.runner;

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
