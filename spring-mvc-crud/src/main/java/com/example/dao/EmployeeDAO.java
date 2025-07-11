package com.example.dao;
import java.util.List;
import com.example.model.Employee;

public interface EmployeeDAO {
    void save(Employee employee);
    Employee findById(Long id);
    List<Employee> findAll();
    void update(Employee employee);
    void delete(Long id);
}
