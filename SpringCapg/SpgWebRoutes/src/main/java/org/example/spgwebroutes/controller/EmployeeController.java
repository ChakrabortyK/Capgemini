package org.example.spgwebroutes.controller;

import org.example.spgwebroutes.model.Employee;
import org.example.spgwebroutes.repo.EmployeeRepo;
import org.example.spgwebroutes.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService empService;


    public EmployeeController(EmployeeService empService) {
        this.empService = empService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllUsers() {
        return empService.getAll();
    }


    @GetMapping("/employee/{id}")
    public Employee getById(@PathVariable int id){
        return empService.getById(id);
    }
    @PostMapping("/add")
    public Employee save(@RequestBody Employee e){
        return empService.save(e);
    }


}
