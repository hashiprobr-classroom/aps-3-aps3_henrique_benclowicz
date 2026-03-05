package br.edu.insper.desagil.aps3.vapor;

import java.util.HashMap;
import java.util.Map;

public class Jogo {

    private int id;
    private String nome;
    private Map<String, Integer> avaliacoes;

    public Jogo(int id, String nome){
        this.id = id;
        this.nome = nome;
        this.avaliacoes = new HashMap<>();
    }

    public void addAvaliacao(String apelido, int avaliacao){
        avaliacoes.put(apelido,avaliacao);
    }

    public double mediaAvaliacao(){
        double soma = 0;
        for (int av : avaliacoes.values()){
            soma += av;
        }
        return soma/avaliacoes.size();
    }
}
