package com.CrudRestfulApi.emsbackend.service;

import com.CrudRestfulApi.emsbackend.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
}