package com.example.TDE4sexshop.repository;

import com.example.TDE4sexshop.model.SexShop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SexshopRepository extends JpaRepository<SexShop, Long> {
}
