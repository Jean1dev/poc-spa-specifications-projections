package com.poc.specs.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "funcionarios")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String salario;

    private String descricao;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "cargo_id", nullable = false)
    private Cargo cargo;

    @Fetch(FetchMode.SELECT)
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "funcionarios_unidades", joinColumns = {@JoinColumn(name = "fk_funcionarios")}, inverseJoinColumns = {@JoinColumn(name = "fk_unidade")})
    private List<UnidadeTrabalho> unidadesTrabalho;
}
