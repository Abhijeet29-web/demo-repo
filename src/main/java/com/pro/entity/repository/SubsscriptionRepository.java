package com.pro.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pro.entity.Subscription;

@Repository
public interface SubsscriptionRepository extends JpaRepository<Subscription, Long>
{

}
