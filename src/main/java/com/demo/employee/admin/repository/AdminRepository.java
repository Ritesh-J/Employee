package com.demo.employee.admin.repository;

import com.demo.employee.admin.model.AdminModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdminModel,Integer> {

}
