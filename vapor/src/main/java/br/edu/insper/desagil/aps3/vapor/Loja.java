package br.edu.insper.desagil.aps3.vapor;

import java.util.List;

public class Loja {

    private Usuario dono;
    private List<Jogo> jogos;

    public Loja(Usuario dono, List<Jogo> jogos){
        this.dono = dono;
        this.jogos = jogos;
    }

    public int avaliados(Usuario usuario){
        String apelido = usuario.getApelido();
        int soma = 0;
        for (Jogo j : jogos){
            if (j.isInAvaliacoes(apelido)){
                soma += 1;
            }
        }
        return soma;
    }

    public Usuario getDono() {
        return dono;
    }
}
