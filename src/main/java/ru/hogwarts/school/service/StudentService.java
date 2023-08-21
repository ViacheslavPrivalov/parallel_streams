package ru.hogwarts.school.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.repositoy.StudentRepository;

import java.util.Collection;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    Logger logger = LoggerFactory.getLogger(StudentService.class);

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student) {

        logger.info("Was invoked method for create student");
        return studentRepository.save(student);
    }

    public Student findStudent(long id) {

        logger.info("Was invoked method for find student");
        return studentRepository.findById(id).get();
    }

    public Student editStudent(Student student) {

        logger.info("Was invoked method for edit student");
        return studentRepository.save(student);
    }

    public void deleteStudent(long id) {

        logger.info("Was invoked method for delete student");
        studentRepository.deleteById(id);
    }

    public Collection<Student> getAll() {

        logger.info("Was invoked method for find all students");
        return studentRepository.findAll();
    }

    public Collection<Student> getByAge(int min, int max) {

        logger.info("Was invoked method for get student by age");
        return studentRepository.findByAgeBetween(min, max);
    }

    public String getStudentsFaculty(String name) {

        logger.info("Was invoked method for find student's faculty");
        return studentRepository.findByNameContainingIgnoreCase(name).getFaculty().getName();
    }

    public Integer countAll() {

        logger.info("Was invoked method for count students");
        return studentRepository.countAll();
    }

    public Long averageAge() {

        logger.info("Was invoked method for find average age of students");
        return studentRepository.averageAge();
    }

    public Collection<Student> last5Students() {

        logger.info("Was invoked method for find last 5 students");
        return studentRepository.last5Students();
    }
}
