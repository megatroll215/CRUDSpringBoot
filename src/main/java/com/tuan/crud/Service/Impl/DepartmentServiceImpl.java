package com.tuan.crud.Service.Impl;

import com.tuan.crud.Entities.Department;
import com.tuan.crud.Service.DepartmentService;
import com.tuan.crud.repo.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Optional<List<Department>> getAllDep() {
       return departmentRepository.getDepartment();
    }
}
