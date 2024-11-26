package com.example.TDE4sexshop.service;

import com.example.TDE4sexshop.model.SexShop;
import com.example.TDE4sexshop.repository.SexshopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SexshopService {

    @Autowired
    private SexshopRepository sexshopRepository;

    // Listar todos os sexshops
    public List<SexShop> findAll() {
        // Correção: Usar a instância 'sexshopRepository' para chamar 'findAll()'
        return sexshopRepository.findAll();
    }

    // Buscar sexshop por ID
    public SexShop findById(Long id) {
        // Correção: Usar a instância 'sexshopRepository' para chamar 'findById()'
        return sexshopRepository.findById(id).orElse(null);
    }

    // Adicionar novo sexshop
    public SexShop save(SexShop sexshop) {
        // Correção: Usar a instância 'sexshopRepository' para chamar 'save()'
        return sexshopRepository.save(sexshop);
    }

    // Deletar sexshop
    public void deleteById(Long id) {
        // Correção: Usar a instância 'sexshopRepository' para chamar 'deleteById()'
        sexshopRepository.deleteById(id);
    }
}
