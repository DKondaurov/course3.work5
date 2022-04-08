package pro.sky.java.course3.work5.service;

import pro.sky.java.course3.work5.model.Faculty;

import java.util.Collection;

public interface FacultyService {

    Faculty addFaculty(Faculty faculty);

    Faculty findFaculty(long id);

    void removeFaculty(long id);

    Faculty editFaculty(Faculty faculty);

    Collection<Faculty> filterFacultyByColor(String color, String name);

}
