package com.devsuperior.dssales.dto;

import java.io.Serializable;

import com.devsuperior.dssales.entities.Gender;

public class SalesByGenderDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Gender gender;
	private Double sum;
	
	public SalesByGenderDTO() {
	}

	public SalesByGenderDTO(Gender gender, Double sum) {
		this.gender = gender;
		this.sum = sum;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
}
