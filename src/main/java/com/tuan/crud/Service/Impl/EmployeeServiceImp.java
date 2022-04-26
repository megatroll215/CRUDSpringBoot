package com.tuan.crud.Service.Impl;

import com.tuan.crud.Entities.Employee;
import com.tuan.crud.Service.EmployeeService;
import com.tuan.crud.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee addEmployee(Employee employee) {
            return employeeRepository.save(employee);

    }

    @Override
    public Employee UpdateEmployee(int id, Employee employee) {
        if(employee!= null){
            Employee e = employeeRepository.getById(id);
            if(e!=null){
                e.setName(employee.getName());
                e.setAge(employee.getAge());
                e.setAddress(employee.getAddress());
                e.setPhone(employee.getPhone());
                e.setModifiedDate(LocalDate.now());
                e.setRole(employee.getRole());
                return employeeRepository.save(e);
            }



        }

            return null;

    }

    @Override
    public Employee ChangeStatusEmployee(int id, int status) {
        Optional<Employee> e = employeeRepository.findById(id);
        if(e!=null){
            e.get().setStatus(status);
            employeeRepository.save(e.get());
            return e.get();
        }
        return null;

    }
}
