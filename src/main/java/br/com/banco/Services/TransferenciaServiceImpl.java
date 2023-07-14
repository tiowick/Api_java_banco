package br.com.banco.Services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.banco.Repositories.TransferenciaRepository;
import br.com.banco.model.Transferencia;

@Service
public class TransferenciaServiceImpl implements TransferenciaService {

    private final TransferenciaRepository transferenciaRepository;

    public TransferenciaServiceImpl(TransferenciaRepository transferenciaRepository) {
        this.transferenciaRepository = transferenciaRepository;
    }

    @Override
    public List<Transferencia> buscarTransferencias(String nomeOperador, LocalDateTime dataInicial, LocalDateTime dataFinal) {
        
        if (nomeOperador != null && dataInicial != null && dataFinal != null) {
            return transferenciaRepository.findByNomeOperadorAndDataTransferenciaBetween(nomeOperador, dataInicial, dataFinal);
        } else if (nomeOperador != null) {
            return transferenciaRepository.findByNomeOperador(nomeOperador);
        } else if (dataInicial != null && dataFinal != null) {
            return transferenciaRepository.findByDataTransferenciaBetween(dataInicial, dataFinal);
        } else {
            return transferenciaRepository.findAll();
        }
    }

    
}
