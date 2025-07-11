package com.example.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dao.EmployeeDAO;
import com.example.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public void saveEmployee(Employee employee) {
        employeeDAO.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeDAO.findById(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDAO.findAll();
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeDAO.update(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeDAO.delete(id);
    }
}
