package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JogoTest {

    private Jogo jogo;
    private static final double DELTA = 0.01;

    @BeforeEach
    public void setUp(){
        jogo = new Jogo(1,"Rocket League");
    }

    @Test
    public void constroi(){
        assertEquals(1, jogo.getId());
        assertEquals("Rocket League", jogo.getNome());
        assertEquals(0, jogo.media());
    }

    @Test
    public void avaliaUmaVez(){
        jogo.avalia("Benclo",3);
        assertEquals(3, jogo.media());
        assertTrue(jogo.avaliado("Benclo"));
        assertFalse(jogo.avaliado("Yochai"));
    }

    @Test
    public void avaliaDuasVezes(){
        jogo.avalia("Benclo",3);
        jogo.avalia("Daniel",4);
        assertEquals(3.5, jogo.media());
        assertTrue(jogo.avaliado("Benclo"));
        assertTrue(jogo.avaliado("Daniel"));
    }

    @Test
    public void avaliaTresVezes(){
        jogo.avalia("Benclo",3);
        jogo.avalia("Daniel",4);
        jogo.avalia("Benclo",5);
        assertEquals(4.5, jogo.media());
    }
}
