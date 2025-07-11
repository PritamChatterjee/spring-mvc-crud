package com.example.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.Employee;
import com.example.service.EmployeeService;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // List all employees
    @GetMapping("/")
    public String listEmployees(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "employee-list";
    }

    // Show form to create new employee
    @GetMapping("/new")
    public String showNewEmployeeForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "employee-form";
    }

    // Save employee
    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
    	System.out.println("here122 ");
        if (employee.getId() == null) {
            employeeService.saveEmployee(employee);
        } 
//        else {
//        	System.out.println("herefsd");
//           employeeService.updateEmployee(employee); // Update existing employee
//	        	
//        }
        return "redirect:/";
    }
    
    
 // Update employee
    @PostMapping("/edit/{id}")
    public String updateEmployee(@ModelAttribute("employee") Employee employee) 
    {
    	
           employeeService.updateEmployee(employee); // Update existing employee
        	
           return "redirect:/";
    }

   
    // Show form to edit employee
    @GetMapping("/edit/{id}" )
    public String showEditEmployeeForm(@PathVariable("id") Long id, Model model) {
        Employee employee = employeeService.getEmployeeById(id);
        model.addAttribute("employee", employee);
        return "employee-update";
    }

    // Delete employee
    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable("id") Long id) {
        employeeService.deleteEmployee(id);
        return "redirect:/";
    }
}
