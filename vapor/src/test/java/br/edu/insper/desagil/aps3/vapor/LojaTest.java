package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LojaTest {

    private Loja loja;
    private Usuario dono;
    private Usuario user;
    private Jogo rl;
    private Jogo cs;
    private Jogo r6;

    @BeforeEach
    void setUp(){

        dono = new Usuario("Benclo","Henrique Benclowicz");
        user = new Usuario("Dani", "Daniel Gozzi");

        rl = new Jogo(1,"RL");
        cs = new Jogo(2,"CS");
        r6 = new Jogo(3,"R6");

        List<Jogo> jogos = new ArrayList<>();
        jogos.add(rl);
        jogos.add(cs);
        jogos.add(r6);

        loja = new Loja(dono, jogos);
    }

    @Test
    void constroi(){
        assertEquals(dono, loja.getDono());
        assertEquals(0,loja.numeroAvaliados(dono));
    }

    @Test
    void umUsuarioAvaliaUmJogo(){
        rl.avalia(dono.getApelido(),10);
        assertEquals(1,loja.numeroAvaliados(dono));
    }

    @Test
    void umUsuarioAvaliaDoisJogos(){
        rl.avalia(dono.getApelido(),10);
        cs.avalia(dono.getApelido(),10);
        assertEquals(2,loja.numeroAvaliados(dono));
    }

    @Test
    void doisUsuariosAvaliamUmJogo(){
        rl.avalia(dono.getApelido(),10);
        rl.avalia(user.getApelido(),10);
        assertEquals(1,loja.numeroAvaliados(dono));
        assertEquals(1,loja.numeroAvaliados(user));
    }

    @Test
    void doisUsuariosAvaliamDoisJogos(){
        rl.avalia(dono.getApelido(),10);
        r6.avalia(user.getApelido(),10);
        assertEquals(1,loja.numeroAvaliados(dono));
        assertEquals(1,loja.numeroAvaliados(user));
    }

}
