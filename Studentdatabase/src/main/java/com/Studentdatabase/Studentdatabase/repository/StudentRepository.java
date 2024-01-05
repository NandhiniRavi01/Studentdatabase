package com.Studentdatabase.Studentdatabase.repository;

import com.Studentdatabase.Studentdatabase.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {//Entity class


}
