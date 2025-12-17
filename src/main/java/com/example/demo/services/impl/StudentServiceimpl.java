package com.example.demo.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;
import com.example.demo.repository.Studentrepo;
import com.example.demo.service.StudentService;
@Service
public class StudentServiceimpl implements StudentService {
    @Autowired
    Studentrepo StudentRep;
    @Override
    public Student insertStudent(Student st) {
        return StudentRep.save(st);
    }
    @Override
    public List<Student> getAllStudents() {
        return StudentRep.findAll();
    }
   
    @Override
    public Optional<Student> getOneStudent(Long id) {
        return StudentRep.findById(id);
    }
    @Override
    public void deleteStudent(Long id) {
        StudentRep.deleteById(id);
    }
}