package pro.sky.java.course3.work5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.java.course3.work5.model.Student;

import java.util.Collection;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Collection<Student> findStudentByAge(int age);

    Collection<Student> findByAgeBetween(int man, int max);
}
