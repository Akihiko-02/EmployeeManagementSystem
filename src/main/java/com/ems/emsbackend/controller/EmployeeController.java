package com.ems.emsbackend.controller;

import com.ems.emsbackend.dto.EmployeeDto;
import com.ems.emsbackend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor
public class EmployeeController {

     private EmployeeService employeeService;

     //Add API
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto savedEmployeedto =  employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployeedto, HttpStatus.CREATED);
    }

    //Get API
    @GetMapping("{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long employeeId) {
        EmployeeDto employeeDto =  employeeService.getEmployeeById(employeeId);
        return  ResponseEntity.ok(employeeDto);
    }

    //Get all API
    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getAllEmployees() {
        List<EmployeeDto> employees = employeeService.getallEmployee();
        return ResponseEntity.ok(employees);
    }

    //Update API
    @PutMapping("{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable("id") Long employeeId,
                                                      @RequestBody EmployeeDto updateEmployee) {
        EmployeeDto employeeDto =  employeeService.updateEmployee(employeeId, updateEmployee);
        return ResponseEntity.ok(employeeDto);
    }

    //Delete API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeId) {
        employeeService.deleteEmployee(employeeId);
        return ResponseEntity.ok("Deleted successfully");
    }

}
