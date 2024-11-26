package com.example.TDE4sexshop.service;

import com.example.TDE4sexshop.model.produtor;
import com.example.TDE4sexshop.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class produtorService {

    @Autowired
    private ProdutoRepository produtoRepository;

    // Listar todos os produtos
    public List<produtor> getAllProdutos() {
        // Correção: Usar a instância 'produtoRepository' para chamar 'findAll()'
        return produtoRepository.findAll();
    }

    // Buscar produto por ID
    public Optional<produtor> getProdutoById(Long id) {
        // Correção: Usar a instância 'produtoRepository' para chamar 'findById()'
        return produtoRepository.findById(id);
    }

    // Adicionar novo produto
    public produtor createProduto(produtor produto) {
        // Correção: Usar a instância 'produtoRepository' para chamar 'save()'
        return produtoRepository.save(produto);
    }

    // Atualizar produto existente
    public produtor updateProduto(Long id, produtor updatedProduto) {
        // Correção: Usar a instância 'produtoRepository' para chamar 'findById()'
        Optional<produtor> existingProduto = produtoRepository.findById(id);
        if (existingProduto.isPresent()) {
            produtor produto = existingProduto.get();
            produto.setNome(updatedProduto.getNome());
            produto.setPreco(updatedProduto.getPreco());
            produto.setDescricao(updatedProduto.getDescricao());
            produto.setQuantidade(updatedProduto.getQuantidade());
            // Correção: Usar a instância 'produtoRepository' para chamar 'save()'
            return produtoRepository.save(produto);
        } else {
            throw new RuntimeException("Produto com ID " + id + " não encontrado.");
        }
    }

    // Deletar produto
    public void deleteProduto(Long id) {
        // Correção: Usar a instância 'produtoRepository' para chamar 'existsById()'
        if (produtoRepository.existsById(id)) {
            // Correção: Usar a instância 'produtoRepository' para chamar 'deleteById()'
            produtoRepository.deleteById(id);
        } else {
            throw new RuntimeException("Produto com ID " + id + " não encontrado.");
        }
    }
}
