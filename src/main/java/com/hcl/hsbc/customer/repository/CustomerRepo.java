package com.hcl.hsbc.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.hcl.hsbc.customer.entity.CustomerEntity;

public interface CustomerRepo extends JpaRepository <CustomerEntity, Long>{

	CustomerEntity save(Long id);

}
