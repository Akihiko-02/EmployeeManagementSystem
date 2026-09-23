package com.ems.emsbackend.mapper;

import com.ems.emsbackend.dto.EmployeeDto;
import com.ems.emsbackend.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto maptToEmployeeDto(Employee employee) {
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public static Employee maptToEmployee(EmployeeDto employeeDto) {
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }

}
