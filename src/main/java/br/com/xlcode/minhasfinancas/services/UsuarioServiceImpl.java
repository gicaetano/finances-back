package br.com.xlcode.minhasfinancas.services;

import br.com.xlcode.minhasfinancas.entities.Usuario;
import br.com.xlcode.minhasfinancas.exceptions.ErroAutenticacao;
import br.com.xlcode.minhasfinancas.exceptions.RegraNegocioException;
import br.com.xlcode.minhasfinancas.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public Usuario autenticar(String email, String senha) {
        Optional<Usuario> usuario = usuarioRepository.findByEmail(email);
        if(usuario.isEmpty()) {
           throw new ErroAutenticacao("Usuário não encontrado, para o e-mail informado");
        }
        if(!usuario.get().getSenha().equals(senha)){
            throw new ErroAutenticacao("Senha Inválida");
        }
        return usuario.get();
    }

    @Override
    @Transactional
    public Usuario salvarUsuario(Usuario usuario) {
        validarEmail(usuario.getEmail());
        return usuarioRepository.save(usuario);
    }

    @Override
    public void validarEmail(String email) {
        boolean existeEmail = usuarioRepository.existsByEmail(email);
        if(existeEmail) {
            throw new RegraNegocioException("Já existe um usuário cadastrado com esse e-mail");
        }
    }
}
