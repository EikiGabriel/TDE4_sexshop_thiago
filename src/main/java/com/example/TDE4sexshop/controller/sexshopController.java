package com.example.TDE4sexshop.controller;

import com.example.TDE4sexshop.model.SexShop;
import com.example.TDE4sexshop.service.SexshopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sexshops")

public class sexshopController {
    @Autowired
    private SexshopService sexshopService;
    private Long id;

    @GetMapping
    public List<SexShop> getAllSexshops() {
        return sexshopService.findAll();
    }

    @GetMapping("/{id}")
    public SexShop getSexshopById(@PathVariable Long id) {
        return sexshopService.findById(id);
    }

    @PostMapping
    public SexShop createSexshop(@RequestBody SexShop sexshop) {
        return sexshopService.save(sexshop);
    }

    @PutMapping("/{id}")
    public SexShop updateSexshop(@PathVariable Long id, @RequestBody SexShop sexshop) {
        sexshop.setId(id);
        return sexshopService.save(sexshop);
    }

    @DeleteMapping("/{id}")
    public void deleteSexshop(@PathVariable Long id) {
        sexshopService.deleteById(id);
    }

    public void setId(Long id) {
        this.id = id;
    }
}
