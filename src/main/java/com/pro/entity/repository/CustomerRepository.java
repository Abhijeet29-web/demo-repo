package com.pro.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pro.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>
{

}
