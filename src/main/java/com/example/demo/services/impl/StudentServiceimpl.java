package com.example.demo.services.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;
import com.example.demo.repository.Studentrepo;
import com.example.demo.services.StudentService;

@Service
public class StudentServiceimpl implements StudentService
{
    @Autowired
    Studentrepo stRepo;

    @Override
    public Student insertStudent(Student st)
    {
             
             stRepo.save(st);
             return st;
    }

    @Override
    public List<Student> getAllStudents()
    {

        return stRepo.findAll();
    }

    @Override
    public Optional<Student> getOneStudent(Long id)
    {
        return stRepo.findById(id);
    }
   
    
    

    @Override
    public void deleteStudent(Long id)
    {
         stRepo.deleteById(id);
    }


}