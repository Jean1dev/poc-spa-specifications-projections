package com.poc.specs.repository;

import com.poc.specs.entity.Funcionario;
import com.poc.specs.projections.IdAndSalarioFuncionario;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepo extends PagingAndSortingRepository<Funcionario, Integer>, JpaSpecificationExecutor<Funcionario> {

    @Query(value = "select f.id, f.descricao, f.salario from funcionarios f", nativeQuery = true)
    List<IdAndSalarioFuncionario> findByProjection();
}
