package com.poc.specs.repository;

import com.poc.specs.entity.UnidadeTrabalho;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadeTrabalhoRepo extends CrudRepository<UnidadeTrabalho, Integer> {
}
