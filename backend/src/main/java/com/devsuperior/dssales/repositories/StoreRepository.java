package com.devsuperior.dssales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dssales.entities.Store;

public interface StoreRepository extends JpaRepository<Store, Long> {

}
