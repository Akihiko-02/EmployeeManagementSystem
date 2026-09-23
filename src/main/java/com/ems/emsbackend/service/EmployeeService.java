package com.ems.emsbackend.service;

import com.ems.emsbackend.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long Employeeid);
    List<EmployeeDto> getallEmployee();
    EmployeeDto updateEmployee(Long employeeid, EmployeeDto updatedEmployeeDto);
    void deleteEmployee(Long Employeeid);
}
