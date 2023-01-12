package com.example.ejemplo2;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends PagingAndSortingRepository<CustomerEntity, Long> {
    //http://localhost:8080/api/customer/search/findByNameIgnoreCaseContaining?name=NomBrE
    public List<CustomerEntity> findByNameIgnoreCaseContaining(@Param("name") String name);

    //http://localhost:8080/api/customer?page=0&size=5&sort=name
}
