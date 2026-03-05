package br.edu.insper.desagil.aps3.vapor;

import java.util.List;

public abstract class Comunidade {
    public List<Usuario> membros;

    public Comunidade(List<Usuario> membros){
        this.membros = membros;
    }
    public void adicionaMembro(Usuario usuario){
        membros.add(usuario);
    }
}
