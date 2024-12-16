package com.nf.StudentCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nf.StudentCrud.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
