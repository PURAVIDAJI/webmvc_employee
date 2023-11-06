package com.example.webmvc_employee.repository;

import com.example.webmvc_employee.entitiy.Employee;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor //꼭 필요한 생성자는 알아서 만들어줘// autowired가 된다.
//생성자+ autowired된 것임.
public class EmployeeRepository {
    private final EntityManager em;

    public List<Employee> findAll() {
        return em.createQuery("select e from Employee e", Employee.class)
                .getResultList();
    }

    public Employee findById(String empId) {
        return em.find(Employee.class, empId);
    }

    public void save(Employee employee) {
        em.persist(employee);
    }

    public void update(Employee employee) {
        em.merge(employee);
    }

    public void delete(Employee employee) {
        em.remove(employee);
    }



}
