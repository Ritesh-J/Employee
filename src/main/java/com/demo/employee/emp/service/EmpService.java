package com.demo.employee.emp.service;

import com.demo.employee.admin.model.AdminModel;
import com.demo.employee.admin.repository.AdminRepository;
import com.demo.employee.emp.model.EmpModel;
import com.demo.employee.emp.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {
    @Autowired
    private EmpRepository empRepository;

    public EmpModel saveDetails(EmpModel payload) {
        return empRepository.save(payload);
    }

    public List<EmpModel> findDetails() {
        return empRepository.findAll();
    }

    public Optional<EmpModel> findDetailsById(int id) {
        return empRepository.findById(id);
    }

    public EmpModel updateDetails(Integer id, EmpModel userDetails) {
        Optional<EmpModel> user=empRepository.findById(id);
        if(empRepository.existsById(id)) {
            EmpModel newUser=user.get();
            newUser.setFirstName(userDetails.getFirstName());
            newUser.setLastName(userDetails.getLastName());
            return empRepository.save(newUser);
        }
        else
            return null;
    }
    public String deleteById(Integer id) {
        empRepository.deleteById(id);
        return "Deleted";
    }
}
