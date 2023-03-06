package com.demo.employee.admin.service;

import com.demo.employee.admin.model.AdminModel;
import com.demo.employee.admin.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public AdminModel saveDetails(AdminModel payload) {
        return adminRepository.save(payload);
    }
}
