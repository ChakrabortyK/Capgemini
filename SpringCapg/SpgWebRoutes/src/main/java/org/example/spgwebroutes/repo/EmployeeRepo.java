package org.example.spgwebroutes.repo;

import org.example.spgwebroutes.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//Understand the use of proxy class
@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
