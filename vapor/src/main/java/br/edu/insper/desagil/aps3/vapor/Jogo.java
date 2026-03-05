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

    public void avalia(String apelido, int avaliacao){
        avaliacoes.put(apelido,avaliacao);
    }

    public double media(){
        double soma = 0;
        if (avaliacoes.isEmpty()){
            return 0;
        }
        else {
            for (int av : avaliacoes.values()) {
                soma += av;
            }
            return soma / avaliacoes.size();
        }
    }

    public boolean avaliado(String apelido){
        if (avaliacoes.containsKey(apelido)){
            return true;
        }
        else{
            return false;
        }
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
