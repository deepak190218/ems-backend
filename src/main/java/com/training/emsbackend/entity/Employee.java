package com.training.emsbackend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="employee_details")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name="employee_name")
    String employeeName;
    @Column(name="employee_email")
    String employeeEmail;
    @Column(name="employee_address")
    String employeeAddress;
    @Column(name="employee_id")
    String employeeId;

}
