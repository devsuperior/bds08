package com.devsuperior.dssales.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dssales.dto.SalesByGenderDTO;
import com.devsuperior.dssales.dto.SalesSummaryDTO;
import com.devsuperior.dssales.repositories.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	@Transactional(readOnly = true)
	public List<SalesByGenderDTO> salesByGender(Long storeId) {
		return repository.salesByGender(storeId);
	}

	@Transactional(readOnly = true)
	public SalesSummaryDTO salesSummary(Long storeId) {
		return repository.salesSummary(storeId);
	}
}
