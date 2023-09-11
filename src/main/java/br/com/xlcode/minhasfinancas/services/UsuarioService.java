package br.com.xlcode.minhasfinancas.services;

import br.com.xlcode.minhasfinancas.entities.Usuario;

public interface UsuarioService {

    Usuario autenticar(String email, String senha);

    Usuario salvarUsuario(Usuario usuario);

    void validarEmail(String email);

}
