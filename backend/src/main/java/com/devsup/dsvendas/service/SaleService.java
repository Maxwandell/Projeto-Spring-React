package com.devsup.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsup.dsvendas.dto.SaleDTO;
import com.devsup.dsvendas.dto.SaleSucessDTO;
import com.devsup.dsvendas.dto.SaleSumDTO;
import com.devsup.dsvendas.entitities.Sale;
import com.devsup.dsvendas.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository saleRepo;
	
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		 Page<Sale> result = saleRepo.findAll(pageable);
		 return result.map(x -> new SaleDTO(x));
	}
	
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupdByseller(){
		return saleRepo.amountGroupdByseller();
	}
	@Transactional(readOnly = true)
	public List<SaleSucessDTO> sucessGroupdByseller(){
		return saleRepo.sucessGroupdByseller();
	}

}

