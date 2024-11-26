package com.example.TDE4sexshop.repository;

import com.example.TDE4sexshop.model.produtor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<produtor, Long> {
}
