package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComunidadeTest {
    private Comunidade comunidade;
    private Usuario user1;
    private Usuario user2;

    @BeforeEach
    public void setUp(){
        user1 = new Usuario("Benclo", "Henrique");
        user2 = new Usuario("Dani", "Daniel");

        List<Usuario> membros = new ArrayList<>();
        comunidade = new Comunidade(membros);
    }

    @Test
    public void constroi(){
        List<String> esperado = List.of();
        assertEquals(esperado,comunidade.apelidosMembros());
    }

    @Test
    public void adicionaUmMembro(){
        comunidade.adicionaMembro(user1);
        List<String> esperado = List.of("Benclo");
        assertEquals(esperado,comunidade.apelidosMembros());
    }

    @Test
    public void adicionaDoisMembros(){
        comunidade.adicionaMembro(user1);
        comunidade.adicionaMembro(user2);
        List<String> esperado = List.of("Benclo","Dani");
        assertEquals(esperado,comunidade.apelidosMembros());
    }

}
