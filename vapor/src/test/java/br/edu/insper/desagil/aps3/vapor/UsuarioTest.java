package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {

    private Usuario usuario;

    @BeforeEach
    void setUp(){
        usuario = new Usuario("Benclo","Henrique Benclowicz");
    }

    @Test
    void constroi(){
        assertEquals("Benclo", usuario.getApelido());
        assertEquals("Henrique Benclowicz", usuario.getNome());
    }

    @Test
    void mudaNome(){
        usuario.setNome("Daniel");
        assertEquals("Daniel", usuario.getNome());
    }
}
