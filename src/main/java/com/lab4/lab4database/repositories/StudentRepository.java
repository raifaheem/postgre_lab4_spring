package com.lab4.lab4database.repositories;

import com.lab4.lab4database.entities.Student;

import org.springframework.data.jpa.repository.JpaRepository;



public interface StudentRepository extends JpaRepository<Student, Long> {

}
