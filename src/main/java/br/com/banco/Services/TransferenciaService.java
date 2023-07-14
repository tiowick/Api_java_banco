package br.com.banco.Services;

import java.time.LocalDateTime;
import java.util.List;

import br.com.banco.model.Transferencia;

public interface TransferenciaService{
    
    List<Transferencia> buscarTransferencias(String nomeOperador, LocalDateTime dataInicial, LocalDateTime dataFinal);
    
}
