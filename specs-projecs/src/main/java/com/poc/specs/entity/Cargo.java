package com.poc.specs.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cargos")
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descricao;

    @OneToMany(mappedBy = "cargo")
    private List<Funcionario> funcionarios;
}
