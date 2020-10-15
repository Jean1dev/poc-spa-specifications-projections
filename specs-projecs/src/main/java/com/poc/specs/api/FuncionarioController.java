package com.poc.specs.api;

import com.poc.specs.entity.Funcionario;
import com.poc.specs.repository.FuncionarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cargos")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepo repository;

    @GetMapping
    @Cacheable(value = "func-list")
    public Page<Funcionario> getAll(@RequestParam(value = "page", defaultValue = "0", required = false) int page,
                                    @RequestParam(value = "size", defaultValue = "10", required = false) int size) {
        return repository.findAll(PageRequest.of(page, size));
    }

    @PostMapping
    @CacheEvict(value = "func-list")
    public ResponseEntity save(@RequestBody Funcionario funcionario) {
        repository.save(funcionario);
        return ResponseEntity.ok().build();
    }
}
