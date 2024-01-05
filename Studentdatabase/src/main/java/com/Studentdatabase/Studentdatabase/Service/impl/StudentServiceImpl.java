package com.Studentdatabase.Studentdatabase.Service.impl;
import com.Studentdatabase.Studentdatabase.entity.Student;
import com.Studentdatabase.Studentdatabase.repository.StudentRepository;
import com.Studentdatabase.Studentdatabase.Service.StudentService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {


    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }


    @Override
    public List<Student> getAllStudents() {
        //for sort serial number
        return studentRepository.findAll(Sort.by(Sort.Direction.ASC,"sno"));
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        //this method update then it want to save it before display
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
}
