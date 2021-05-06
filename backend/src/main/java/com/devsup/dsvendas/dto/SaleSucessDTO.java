package com.devsup.dsvendas.dto;

import java.io.Serializable;

import com.devsup.dsvendas.entitities.Seller;

public class SaleSucessDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String sellerName;
	private Long visited;
	private Long deals;
	
	public SaleSucessDTO() {
		
	}

	public SaleSucessDTO(Seller sellerName, Long visited, Long deals) {
		
		this.sellerName = sellerName.getName();
		this.visited = visited;
		this.deals = deals;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}
	
	
}
