package com.devsup.dsvendas.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsup.dsvendas.dto.SellerDTO;
import com.devsup.dsvendas.entitities.Seller;
import com.devsup.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository sellerRepo;
	
	public List<SellerDTO> findAll(){
		 List<Seller> result = sellerRepo.findAll();
		 return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}

}
