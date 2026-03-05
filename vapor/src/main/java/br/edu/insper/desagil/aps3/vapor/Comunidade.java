package br.edu.insper.desagil.aps3.vapor;

import java.util.List;

public class Comunidade {
    private List<Usuario> usuarios;

    public Comunidade(List<Usuario> usuarios){
        this.usuarios = usuarios;
    }
    public void addUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
}
