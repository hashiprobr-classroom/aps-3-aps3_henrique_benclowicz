package br.edu.insper.desagil.aps3.vapor;

import java.util.List;

public abstract class Comunidade {
    public List<Usuario> usuarios;

    public Comunidade(List<Usuario> usuarios){
        this.usuarios = usuarios;
    }
    public void addUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
}
