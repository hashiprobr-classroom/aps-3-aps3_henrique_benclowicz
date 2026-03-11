package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComunidadeDeJogoTest {
    private ComunidadeDeJogo comunidade;
    private Jogo jogo;
    private Usuario user1;
    private Usuario user2;

    @BeforeEach
    public void setUp(){
        jogo = new Jogo(1,"RL");
        user1 = new Usuario("Benclo","Henrique");
        user2 = new Usuario("Dani","Daniel");
        List<Usuario> membros = new ArrayList<>();

        comunidade = new ComunidadeDeJogo(jogo,membros);

    }

    @Test
    public void adicionaDoisInvalidos(){
        comunidade.adicionaMembro(user1);
        comunidade.adicionaMembro(user2);
        List<String> esperado = List.of();
        assertEquals(esperado, comunidade.apelidosMembros());
    }

    @Test
    public void adicionaUmInvalido(){
        jogo.avalia("Benclo",10);
        comunidade.adicionaMembro(user1);
        comunidade.adicionaMembro(user2);
        List<String> esperado = List.of("Benclo");
        assertEquals(esperado, comunidade.apelidosMembros());
    }

    @Test
    public void adicionaDoisValidos(){
        jogo.avalia("Benclo",10);
        jogo.avalia("Dani",10);
        comunidade.adicionaMembro(user1);
        comunidade.adicionaMembro(user2);
        List<String> esperado = List.of("Benclo","Dani");
        assertEquals(esperado, comunidade.apelidosMembros());
    }

}
