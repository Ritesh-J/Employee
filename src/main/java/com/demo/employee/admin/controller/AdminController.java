package com.demo.employee.admin.controller;

import com.demo.employee.admin.model.AdminModel;
import com.demo.employee.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/signup/")
@CrossOrigin(origins = "http://localhost:4000")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @PostMapping("save")
    public AdminModel saveDetails(@RequestBody AdminModel payload) {
        return adminService.saveDetails(payload);
    }

}
