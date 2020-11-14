package com.pluralsight.fundamentals.repository;

import com.pluralsight.fundamentals.entity.Application;
import org.springframework.data.repository.CrudRepository;

// extends CrudRepository<Application (=table/entity class), Long (=id of domain class type)>
public interface ApplicationRepository extends CrudRepository<Application, Long> {
}
