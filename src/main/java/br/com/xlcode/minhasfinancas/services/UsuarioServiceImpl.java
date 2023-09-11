package br.com.xlcode.minhasfinancas.services;

import br.com.xlcode.minhasfinancas.entities.Usuario;
import br.com.xlcode.minhasfinancas.exceptions.RegraNegocioException;
import br.com.xlcode.minhasfinancas.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public Usuario autenticar(String email, String senha) {
        return null;
    }

    @Override
    public Usuario salvarUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public void validarEmail(String email) {
        boolean existeEmail = usuarioRepository.existsByEmail(email);
        if(existeEmail) {
            throw new RegraNegocioException("Já existe um usuário cadastrado com esse e-mail");
        }
    }
}
