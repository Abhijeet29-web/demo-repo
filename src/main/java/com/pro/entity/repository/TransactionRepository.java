package com.pro.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pro.entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long>
{

}
