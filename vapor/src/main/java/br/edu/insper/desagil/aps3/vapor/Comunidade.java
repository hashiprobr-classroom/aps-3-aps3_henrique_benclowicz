package br.edu.insper.desagil.aps3.vapor;

import java.util.ArrayList;
import java.util.List;

public class Comunidade {
    public List<Usuario> membros;

    public Comunidade(List<Usuario> membros){
        this.membros = membros;
    }
    public void adicionaMembro(Usuario usuario){

        membros.add(usuario);
    }

    public List<String> apelidosMembros(){
        List<String> lista = new ArrayList<>();

        for (Usuario m : membros){
            lista.add(m.getApelido());
        }
        return lista;
    }
}
