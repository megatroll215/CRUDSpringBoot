package com.tuan.crud.Service;

import com.tuan.crud.Entities.Employee;

import java.util.List;


public interface EmployeeService {
    public List<Employee> getAll();
    public Employee addEmployee(Employee employee);
    public Employee UpdateEmployee(int id, Employee employee);
    public Employee ChangeStatusEmployee(int id, int status);
}
