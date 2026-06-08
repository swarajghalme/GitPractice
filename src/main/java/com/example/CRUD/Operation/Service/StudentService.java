package com.example.CRUD.Operation.Service;

import com.example.CRUD.Operation.Entity.Student;
import com.example.CRUD.Operation.Repository.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepo studentRepo;
    public Student AddStudentinfo(Student student){
       return  studentRepo.save(student);

    }

    public Student UpdateStudent(Student student){
        Student stu = studentRepo.findById(student.getId()).orElseThrow(()->new RuntimeException("Student not found"));

        //isme jitne fields ko lega utne he postman pe update hongi bass
        stu.setName(student.getName());
        stu.setSubject(student.getSubject());
        stu.setMarks(student.getMarks());
        stu.setRollNo(student.getRollNo());
        return  studentRepo.save(stu);
    }


    public Student getStudent(Integer id){
        return studentRepo.findById(id).orElseThrow(()->new RuntimeException("Student not found"));

    }

   public void delStudent(Integer id){
        studentRepo.deleteById(id);
   }


}
