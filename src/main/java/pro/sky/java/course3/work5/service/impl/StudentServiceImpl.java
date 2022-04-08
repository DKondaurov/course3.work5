package pro.sky.java.course3.work5.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.java.course3.work5.model.Student;
import pro.sky.java.course3.work5.repository.StudentRepository;
import pro.sky.java.course3.work5.service.StudentService;

import java.util.Collection;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findStudent(long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void removeStudent(long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student editStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Collection<Student> filterStudentByAge(int age) {
        return studentRepository.findStudentByAge(age);
    }

    @Override
    public Collection<Student> filterStudentsByAgeBetween(int min, int max) {
        return studentRepository.findByAgeBetween(min, max);
    }

}
