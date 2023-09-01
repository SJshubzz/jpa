package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Staff;

public interface DepartmentRepo extends JpaRepository<Staff, Integer> {

}
