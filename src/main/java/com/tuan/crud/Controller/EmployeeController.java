package com.tuan.crud.Controller;


import com.tuan.crud.Entities.Employee;
import com.tuan.crud.Service.Impl.EmployeeServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("employee")
public class EmployeeController {

   private Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    EmployeeServiceImp employeeService;

    @RequestMapping("list")
    public String ViewEmp(){
        return "index";
    }

    @GetMapping("list-employee")
    public ResponseEntity<?> getAllEmployee(){
        return  ResponseEntity.ok(employeeService.getAll());
    }

    @PostMapping ("add")
    public Employee AddEmployee(@RequestBody Employee employee){
       return employeeService.addEmployee(employee);
    }

    @PutMapping("update")
    public Employee UpdateEmployee(@RequestParam("id") int id, @RequestBody Employee employee){
        logger.error("Cannot Update!!!");
        return employeeService.UpdateEmployee(id,employee);

    }

    @PutMapping("change-status")
    public ResponseEntity<?> ChangeStatusEmployee(@RequestParam int id, @RequestParam int status){
        logger.error("Cannot Change Status!!!");
        return ResponseEntity.ok(employeeService.ChangeStatusEmployee(id,status));
    }
}
