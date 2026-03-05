package br.edu.insper.desagil.aps3.vapor;

import java.util.List;

public class ComunidadeDeJogo extends Comunidade{
    private Jogo jogo;
    public ComunidadeDeJogo(Jogo jogo, List<Usuario> usuarios){
        super(usuarios);

    }

    @Override
    public void addUsuario(Usuario usuario){
        if (jogo.isInAvaliacoes(usuario.getApelido())){
            usuarios.add(usuario);
        }
    }
}
