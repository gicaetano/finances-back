package br.com.xlcode.minhasfinancas.repositories;

import br.com.xlcode.minhasfinancas.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    boolean existsByEmail(String email);

    //Optional<Usuario> findByEmail(String email);
    //Optional<Usuario> findByEmailAndNome(String email, String nome);
}
