package com.poc.specs.specifications;

import com.poc.specs.entity.Funcionario;
import org.springframework.data.jpa.domain.Specification;

public class FuncionarioSpecification {
    public static Specification<Funcionario> nome(String nome) {
        return (root, criteriaQuery, criteriaBuilder) ->
                criteriaBuilder.like(root.get("nome"), "%" + nome + "%");
    }

    public static Specification<Funcionario> cpf(String cpf) {
        return (root, criteriaQuery, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("cpf"), cpf);
    }
}
