package br.com.xlcode.minhasfinancas.repositories;

import br.com.xlcode.minhasfinancas.entities.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {
}
