package com.demo.employee.emp.repository;

import com.demo.employee.emp.model.EmpModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<EmpModel, Integer> {
}
