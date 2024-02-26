package com.CrudRestfulApi.emsbackend.repository;

import com.CrudRestfulApi.emsbackend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
