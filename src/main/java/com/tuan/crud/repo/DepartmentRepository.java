package com.tuan.crud.repo;

import com.tuan.crud.Entities.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;
import java.util.List;
import java.util.Optional;

@Repository
public class DepartmentRepository {
@Autowired
    EntityManagerFactory factory;

private Session getCurrentSession() {
    return factory.unwrap(SessionFactory.class).openSession();
}
public Optional<List<Department>> getDepartment(){
        Session session = getCurrentSession();
        StringBuilder hql =  new StringBuilder("  from Department");
        Query<Department> query = session.createQuery(hql.toString(),Department.class);
        List<Department> list = query.list();
        return  Optional.ofNullable(list);
    }
}

