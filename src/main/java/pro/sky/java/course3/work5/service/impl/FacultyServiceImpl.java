package pro.sky.java.course3.work5.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.java.course3.work5.model.Faculty;
import pro.sky.java.course3.work5.repository.FacultyRepository;
import pro.sky.java.course3.work5.service.FacultyService;

import java.util.Collection;

@Service
public class FacultyServiceImpl implements FacultyService {

    private final FacultyRepository facultyRepository;

    public FacultyServiceImpl(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    @Override
    public Faculty addFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    @Override
    public Faculty findFaculty(long id) {
        return facultyRepository.findById(id).get();
    }

    @Override
    public void removeFaculty(long id) {
        facultyRepository.deleteById(id);
    }

    @Override
    public Faculty editFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    @Override
    public Collection<Faculty> filterFacultyByColor(String color, String name) {
        return facultyRepository.findFacultyByColorIgnoreCaseOrNameIgnoreCase(color, name);
    }

}
