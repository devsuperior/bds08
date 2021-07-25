package com.devsuperior.dssales.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dssales.dto.SalesByGenderDTO;
import com.devsuperior.dssales.dto.SalesSummaryDTO;
import com.devsuperior.dssales.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService service;
	
	@GetMapping(value = "/by-gender")
	public ResponseEntity<List<SalesByGenderDTO>> salesByGender(
			@RequestParam(value = "storeId", defaultValue = "0") Long storeId) {
		List<SalesByGenderDTO> list = service.salesByGender(storeId);
		return ResponseEntity.ok(list);
	}

	@GetMapping(value = "/summary")
	public ResponseEntity<SalesSummaryDTO> salesSummary(
			@RequestParam(value = "storeId", defaultValue = "0") Long storeId) {
		SalesSummaryDTO obj = service.salesSummary(storeId);
		return ResponseEntity.ok(obj);
	}	
}
