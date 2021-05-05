package com.devsup.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsup.dsvendas.entitities.Seller;
public interface SellerRepository extends JpaRepository<Seller, Long>{

}