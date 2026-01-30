# Student Management MVC

## Description

This project implements a simple console-based application to manage student information
(Name, Age, Semester) using the Model-View-Controller (MVC) architectural pattern.

The application loads student data into memory, displays the complete list of students,
and identifies the youngest and oldest student.

## Architecture

The solution follows the Model-View-Controller (MVC) pattern:

- **Model**: Represents student data and business logic.
- **View**: Handles console output formatting.
- **Controller**: Coordinates the interaction between model and view.
- **Runner**: Contains the main entry point of the application.

## How to Run

Run the `ApplicationRunner` class from the `runner` package.

## How to Build

Navigate to the project directory:

```bash
# Navigate to the project directory
cd /path/to/student-management-mvc

# Compile the project
javac -d out $(find . -name "*.java")

# Run the project
java -cp out co.edu.umng.studentmanagement.runner.ApplicationRunner
```

## Project Structure

```
co.edu.umng.studentmanagement
├── model
├── view
├── controller
└── runner
```

## UML Diagram

The UML class diagram used for the design of this project is:

```mermaid
classDiagram
    direction LR

    class Student {
        -String name
        -int age
        -String semester
        +getName() String
        +getAge() int
        +getSemester() String
    }

    class StudentRepository {
        -List~Student~ students
        +addStudent(student: Student)
        +getAllStudents() List~Student~
        +getYoungestStudent() Student
        +getOldestStudent() Student
    }

    class StudentView {
        +showStudents(students: List~Student~)
        +showYoungestStudent(student: Student)
        +showOldestStudent(student: Student)
    }

    class StudentController {
        -StudentRepository repository
        -StudentView view
        +loadStudents()
        +displayStudentInformation()
    }

    class ApplicationRunner {
        +main(args: String[])
    }

    ApplicationRunner --> StudentController
    StudentController --> StudentRepository
    StudentController --> StudentView
    StudentRepository "1" --> "*" Student
``
```
