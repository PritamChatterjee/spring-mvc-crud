package com.example.service;
import java.util.List;
import com.example.model.Employee;

public interface EmployeeService {
    void saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    List<Employee> getAllEmployees();
    void updateEmployee(Employee employee);
    void deleteEmployee(Long id);
}
