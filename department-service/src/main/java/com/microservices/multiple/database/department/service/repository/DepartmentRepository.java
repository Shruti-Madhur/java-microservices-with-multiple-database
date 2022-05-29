package com.microservices.multiple.database.department.service.repository;

import com.microservices.multiple.database.department.service.entity.Department;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, Long> {
}
