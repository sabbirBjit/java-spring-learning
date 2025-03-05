package bjitAcademy.example.CRUD_demo.service;

import bjitAcademy.example.CRUD_demo.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployee(Long employeeId);

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto employeeDto);

    void deleteEmployee(Long employeeId);

    List<EmployeeDto> getAllEmployees();

}
