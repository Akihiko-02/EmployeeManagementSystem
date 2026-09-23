package com.ems.emsbackend.service.impl;

import com.ems.emsbackend.dto.EmployeeDto;
import com.ems.emsbackend.entity.Employee;
import com.ems.emsbackend.exception.ResourceNotFoundException;
import com.ems.emsbackend.mapper.EmployeeMapper;
import com.ems.emsbackend.repository.EmployeeRepository;
import com.ems.emsbackend.service.EmployeeService;
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
        Employee employee = EmployeeMapper.maptToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.maptToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long Employeeid) {
        Employee employee =  employeeRepository.findById(Employeeid)
                .orElseThrow(()-> new ResourceNotFoundException("Employee not existed at id : " + Employeeid));
        return EmployeeMapper.maptToEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> getallEmployee() {
        List<Employee> employees = employeeRepository.findAll();

        return employees.stream()
                .map(EmployeeMapper::maptToEmployeeDto).collect(Collectors.toList());
    }

    @Override
    public EmployeeDto updateEmployee(Long employeeid, EmployeeDto updatedEmployeeDto) {

        Employee employee = employeeRepository.findById(employeeid).orElseThrow(
                ()-> new ResourceNotFoundException("Employee not existed at id : " + employeeid)
        );
        employee.setFirstName(updatedEmployeeDto.getFirstName());
        employee.setLastName(updatedEmployeeDto.getLastName());
        employee.setEmail(updatedEmployeeDto.getEmail());

        Employee updatedEmployeeObj = employeeRepository.save(employee);

        return EmployeeMapper.maptToEmployeeDto(updatedEmployeeObj);
    }

    @Override
    public void deleteEmployee(Long Employeeid) {

        Employee employee = employeeRepository.findById(Employeeid).orElseThrow(
                () -> new ResourceNotFoundException("Employee not existed at id : " + Employeeid)
        );
        employeeRepository.deleteById(Employeeid);
    }


}
