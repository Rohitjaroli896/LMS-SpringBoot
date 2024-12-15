package com.FirstSpringBootApplication.LibraryManagementSystem.Repository;

import com.FirstSpringBootApplication.LibraryManagementSystem.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    public Student findByEmail(String email);
}
