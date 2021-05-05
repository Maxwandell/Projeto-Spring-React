package com.devsup.dsvendas.dto;

import java.util.ArrayList;
import java.util.List;


import com.devsup.dsvendas.entitities.Seller;

public class SellerDTO {
	
	private Long id;
	private String name;
	
	 
	
	public SellerDTO() {
		
	}
	
	
	
	
	public SellerDTO(Long id, String name) {
	
		this.id = id;
		this.name = name;
	}
	public SellerDTO(Seller Entity) {
		
		this.id = Entity.getId();
		this.name = Entity.getName();
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}
	
	

}
