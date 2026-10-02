package com.exemplo.fornecedoresservice.config;

import com.exemplo.fornecedoresservice.model.Fornecedor;
import com.exemplo.fornecedoresservice.repository.FornecedorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final FornecedorRepository fornecedorRepository;

    public DataInitializer(FornecedorRepository fornecedorRepository) {
        this.fornecedorRepository = fornecedorRepository;
    }

    @Override
    public void run(String... args) {
        fornecedorRepository.save(new Fornecedor("Ana Souza", "66615718000109"));
        fornecedorRepository.save(new Fornecedor("Bruno Lima", "89972729000133"));
        fornecedorRepository.save(new Fornecedor("Carla Mendes", "51999770000120"));
        fornecedorRepository.save(new Fornecedor("Diego Rocha", "81797307000167"));
        fornecedorRepository.save(new Fornecedor("Elisa Prado", "21808505000157"));
    }
}
