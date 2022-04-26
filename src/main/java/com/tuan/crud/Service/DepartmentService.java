package com.tuan.crud.Service;

import com.tuan.crud.Entities.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {

    public Optional<List<Department>> getAllDep();
}
