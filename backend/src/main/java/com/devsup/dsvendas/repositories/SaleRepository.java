package com.devsup.dsvendas.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsup.dsvendas.dto.SaleSucessDTO;
import com.devsup.dsvendas.dto.SaleSumDTO;
import com.devsup.dsvendas.entitities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	
	@Query("SELECT new com.devsup.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupdByseller();
	
	
	
	@Query("SELECT new com.devsup.dsvendas.dto.SaleSucessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSucessDTO> sucessGroupdByseller();

}
