package com.example.webmvc_employee.repository;

import com.example.webmvc_employee.entitiy.Employee;
import jakarta.persistence.EntityManager;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeRepositoryTest {


    private jakarta.persistence.EntityManager EntityManager;
    private final EmployeeRepository employeeRepository = new EmployeeRepository(EntityManager);
    @Test
    @Transactional
    void findAll() {
        //given employee
        Employee employee = new Employee();
        employee.setEmpId("202301");
        employee.setEmpName("홍길동");
        employeeRepository.save(employee);
        //when
        List<Employee> employees = employeeRepository.findAll();
        //then
        Assertions.assertThat(employees.size()).isEqualTo(1);

    }
}