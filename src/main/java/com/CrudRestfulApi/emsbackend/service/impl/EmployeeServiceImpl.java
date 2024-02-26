package com.CrudRestfulApi.emsbackend.service.impl;

import com.CrudRestfulApi.emsbackend.dto.EmployeeDto;
import com.CrudRestfulApi.emsbackend.entity.Employee;
import com.CrudRestfulApi.emsbackend.mapper.EmployeeMapper;
import com.CrudRestfulApi.emsbackend.repository.EmployeeRepository;
import com.CrudRestfulApi.emsbackend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployee(Long employeeId){

        return null;
    }
}
