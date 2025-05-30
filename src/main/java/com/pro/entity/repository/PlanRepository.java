package com.pro.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pro.entity.Plan;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Long>
{

}
