package com.poc.specs.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "unidades_trabalho")
public class UnidadeTrabalho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToMany(mappedBy = "unidadesTrabalho", fetch = FetchType.EAGER)
    private List<Funcionario> funcionarios;
}
