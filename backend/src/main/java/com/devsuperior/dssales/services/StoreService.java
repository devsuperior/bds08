package com.devsuperior.dssales.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dssales.dto.StoreDTO;
import com.devsuperior.dssales.entities.Store;
import com.devsuperior.dssales.repositories.StoreRepository;

@Service
public class StoreService {

	@Autowired
	private StoreRepository repository;

	@Transactional(readOnly = true)
	public List<StoreDTO> findAll() {
		List<Store> list = repository.findAll(Sort.by("name"));
		return list.stream().map(x -> new StoreDTO(x)).collect(Collectors.toList());
	}
}
