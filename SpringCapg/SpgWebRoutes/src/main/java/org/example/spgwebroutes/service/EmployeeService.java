package org.example.spgwebroutes.service;

import org.example.spgwebroutes.CustomExceptions.NotFoundException;
import org.example.spgwebroutes.model.Employee;
import org.example.spgwebroutes.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo empRepo;

    public Employee save(Employee e){
        return empRepo.save(e);
    }

    public List<Employee> getAll(){
        return empRepo.findAll();
    }

    public Employee getById(int id) {
        return empRepo.findById(id).orElseThrow(()->new NotFoundException("Employee not found"));
    }

}
