package com.demo.employee.emp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmpModel {
    @Id
    @Column(name = "employeeID")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String emailId;
    @Column(name = "password")
    private String password;
}
