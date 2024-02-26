package com.CrudRestfulApi.emsbackend.service.impl;

import com.CrudRestfulApi.emsbackend.dto.EmployeeDto;
import com.CrudRestfulApi.emsbackend.entity.Employee;
import com.CrudRestfulApi.emsbackend.exception.ResourceNotFoundException;
import com.CrudRestfulApi.emsbackend.mapper.EmployeeMapper;
import com.CrudRestfulApi.emsbackend.repository.EmployeeRepository;
import com.CrudRestfulApi.emsbackend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
    public EmployeeDto getEmployeeById(Long employeeId){
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("There is no Employee found with the given Id: " + employeeId));

        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> getAllEmployees(){
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream().map(EmployeeMapper::mapToEmployeeDto).collect(Collectors.toList());
    }
}
