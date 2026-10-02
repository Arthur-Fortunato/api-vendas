package com.exemplo.fornecedoresservice.service;

import com.exemplo.fornecedoresservice.dto.ProdutoDTO;
import com.exemplo.fornecedoresservice.interfaces.ProdutoInterface;
import com.exemplo.fornecedoresservice.model.Fornecedor;
import com.exemplo.fornecedoresservice.repository.FornecedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

    private final FornecedorRepository fornecedorRepository;
    private final ProdutoInterface produtoInterface;

    public FornecedorService(FornecedorRepository fornecedorRepository, ProdutoInterface produtoInterface) {
        this.fornecedorRepository = fornecedorRepository;
        this.produtoInterface = produtoInterface;
    }

    public List<Fornecedor> listarTodos() {
        return fornecedorRepository.findAll();
    }

    public Optional<Fornecedor> buscarPorId(Long id) {
        return fornecedorRepository.findById(id);
    }

    public Fornecedor salvarFornecedor(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public List<ProdutoDTO> listarProdutos() {
        return produtoInterface.listarTodos();
    }
}
