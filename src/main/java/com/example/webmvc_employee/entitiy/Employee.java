package com.example.webmvc_employee.entitiy;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Employee {
    @Id
    @Column(name = "emp_id",length = 6)
    private String empId;

    @Column(name = "emp_name",length = 10)

    private String empName;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "emp_type",length = 10)
    private EmpType empType;

    @Column(name ="join_date",length = 10)
    private String joinDate;
    private Long salary;

    @ManyToOne
    @JoinColumn(name = "dept_Id")
    private Department department;
}
