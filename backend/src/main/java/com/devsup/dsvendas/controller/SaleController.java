package com.devsup.dsvendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsup.dsvendas.dto.SaleDTO;
import com.devsup.dsvendas.dto.SaleSucessDTO;
import com.devsup.dsvendas.dto.SaleSumDTO;
import com.devsup.dsvendas.service.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService saleService;

	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pegeable) {
		Page<SaleDTO> list = saleService.findAll(pegeable);
		return ResponseEntity.ok(list);

	}
	

	@GetMapping(value = "/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupdByseller( ) {
		List<SaleSumDTO> list = saleService.amountGroupdByseller();
		return ResponseEntity.ok(list);

	}
	@GetMapping(value = "/sucess-by-seller")
	public ResponseEntity<List<SaleSucessDTO>> sucessGroupdByseller( ) {
		List<SaleSucessDTO> list = saleService.sucessGroupdByseller();
		return ResponseEntity.ok(list);

	}

}
