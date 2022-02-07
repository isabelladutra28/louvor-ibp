package com.project.ibp.louvoribp.core.services;

import com.project.ibp.louvoribp.core.domain.marcacao.MarcacaoAgenda;
import com.project.ibp.louvoribp.core.domain.marcacao.MarcacaoAgendaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class MarcacaoAgendaService {

    private final MarcacaoAgendaRepository marcacaoAgendaRepository;

    public MarcacaoAgenda insertMarcacao(MarcacaoAgenda marcacaoAgenda){
        return marcacaoAgendaRepository.inserMarcacao(marcacaoAgenda);
    }

}
