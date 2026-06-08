package com.example.CRUD.Operation.Controller;

import com.example.CRUD.Operation.Entity.Student;
import com.example.CRUD.Operation.Service.StudentService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/add")
@RestController
@RequiredArgsConstructor

public class StudentController {
    private final StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> AddStudent(@RequestBody Student student){
        Student st = studentService.AddStudentinfo(student);
        return ResponseEntity.ok(st);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student){
        Student stu = studentService.UpdateStudent(student);
        return ResponseEntity.ok(stu);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> GetStudent(@PathVariable Integer id){
        Student stud = studentService.getStudent(id);
        return ResponseEntity.ok(stud);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> DelStudent(@PathVariable Integer id){
        studentService.delStudent(id);
        return ResponseEntity.ok().build();

    }

}
