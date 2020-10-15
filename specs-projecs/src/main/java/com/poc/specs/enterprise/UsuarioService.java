package com.poc.specs.enterprise;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UsuarioService {

    private final List<Usuario> usuarios;

    public UsuarioService() {
        usuarios = Collections.singletonList(Usuario.builder()
                .id("1")
                .login("juca")
                .password("$2a$10$YWl4PWjbIkTrPZrwttPwXuzc/BCm4CZoYJADagph8lLUk3Yz97D92")
                .build());
    }

    public Usuario findByLogin(String login) {
        return usuarios.stream().filter(usuario -> usuario.getLogin().equalsIgnoreCase(login)).findFirst().get();
    }
}
