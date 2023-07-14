package br.com.banco.Repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.banco.model.Transferencia;

public interface TransferenciaRepository extends JpaRepository <Transferencia, Long>{

    List<Transferencia> findByNomeOperadorAndDataTransferenciaBetween(String nomeOperador, LocalDateTime dataInicial, LocalDateTime dataFinal);
    List<Transferencia> findByNomeOperador(String nomeOperador);
    List<Transferencia> findByDataTransferenciaBetween(LocalDateTime dataInicial, LocalDateTime dataFinal);
}
