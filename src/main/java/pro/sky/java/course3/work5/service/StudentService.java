package pro.sky.java.course3.work5.service;

import pro.sky.java.course3.work5.model.Student;

import java.util.Collection;

public interface StudentService {
    Student addStudent(Student student);

    Student findStudent(long id);

    void removeStudent(long id);

    Student editStudent(Student student);

    Collection<Student> filterStudentByAge(int age);

    Collection<Student> filterStudentsByAgeBetween(int min, int max);

}
