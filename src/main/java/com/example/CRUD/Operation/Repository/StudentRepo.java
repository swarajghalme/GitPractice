package com.example.CRUD.Operation.Repository;

import com.example.CRUD.Operation.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
