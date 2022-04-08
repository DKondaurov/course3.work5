package pro.sky.java.course3.work5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.java.course3.work5.model.Faculty;

import java.util.Collection;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {

    Collection<Faculty> findFacultyByColorIgnoreCaseOrNameIgnoreCase(String color, String name);

}
