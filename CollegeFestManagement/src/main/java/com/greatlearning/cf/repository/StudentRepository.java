package com.greatlearning.cf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.cf.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
