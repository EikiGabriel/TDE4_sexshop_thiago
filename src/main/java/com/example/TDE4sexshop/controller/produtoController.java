package com.example.TDE4sexshop.controller;


import com.example.TDE4sexshop.model.produtor;
import com.example.TDE4sexshop.service.produtorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
@Tag(name = "Produtos", description = "Endpoints para gerenciar produtos")

public class produtoController {

    @Autowired
    private produtorService produtoService;

    @GetMapping
    @Operation(summary = "Listar todos os produtos", description = "Retorna uma lista de produtos")
    public List<produtor> getAllProdutos() {
        return produtoService.getAllProdutos();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar produto por ID", description = "Retorna um produto pelo ID")
    public produtor getProdutoById(@PathVariable Long id) {
        return produtoService.getProdutoById(id).orElseThrow(() ->
                new RuntimeException("Produto com ID " + id + " não encontrado."));
    }

    @PostMapping
    @Operation(summary = "Adicionar novo produto", description = "Adiciona um novo produto à lista")
    public produtor createProduto(@RequestBody produtor produto) {
        return produtoService.createProduto(produto);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar produto", description = "Atualiza os detalhes de um produto existente")
    public produtor updateProduto(@PathVariable Long id, @RequestBody produtor updatedProduto) {
        return produtoService.updateProduto(id, updatedProduto);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Deletar produto", description = "Remove um produto da lista pelo ID")
    public void deleteProduto(@PathVariable Long id) {
        produtoService.deleteProduto(id);
    }
}
