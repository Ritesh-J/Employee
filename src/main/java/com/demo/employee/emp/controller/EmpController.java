package com.demo.employee.emp.controller;

import com.demo.employee.emp.model.EmpModel;
import com.demo.employee.emp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee/")
public class EmpController {
    @Autowired
    private EmpService empService;

    @PostMapping("save")
    public EmpModel saveDetails(@RequestBody EmpModel payload) {
        return empService.saveDetails(payload);
    }

    @RequestMapping("details")
    public List<EmpModel> findDetails() {
        return empService.findDetails();
    }
    @RequestMapping("details/{id}")
    public Optional<EmpModel> findDetailsById(@PathVariable("id") int id) {
        return empService.findDetailsById(id);
    }
    @RequestMapping(value = "update/{id}", method = RequestMethod.POST)
    public EmpModel updateDetails(@PathVariable("id") Integer id,@RequestBody EmpModel userDetails){
        return empService.updateDetails(id, userDetails);
    }
    @RequestMapping("delete/{id}")
    public String deleteById(@PathVariable("id") int id) {
        return empService.deleteById(id);
    }
}
