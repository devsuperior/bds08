package com.devsuperior.dssales.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dssales.dto.SalesByGenderDTO;
import com.devsuperior.dssales.dto.SalesSummaryDTO;
import com.devsuperior.dssales.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query("SELECT new com.devsuperior.dssales.dto.SalesByGenderDTO(obj.gender, SUM(obj.total)) "
			+ "FROM Sale AS obj "
			+ "WHERE (:storeId = 0L OR obj.store.id = :storeId) "
			+ "GROUP BY obj.gender")
	List<SalesByGenderDTO> salesByGender(Long storeId);

	@Query("SELECT new com.devsuperior.dssales.dto.SalesSummaryDTO(SUM(obj.total), MAX(obj.total), MIN(obj.total), AVG(obj.total), COUNT(obj.id)) "
			+ "FROM Sale AS obj "
			+ "WHERE (:storeId = 0L OR obj.store.id = :storeId) ")
	SalesSummaryDTO salesSummary(Long storeId);
}
