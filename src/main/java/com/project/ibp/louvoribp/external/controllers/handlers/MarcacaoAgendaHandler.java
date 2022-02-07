package com.project.ibp.louvoribp.external.controllers.handlers;

import com.project.ibp.louvoribp.core.domain.marcacao.MarcacaoAgenda;
import com.project.ibp.louvoribp.core.services.MarcacaoAgendaService;
import com.project.ibp.louvoribp.external.controllers.dto.marcacaoagenda.MarcacaoAgendaResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class MarcacaoAgendaHandler {

    private final MarcacaoAgendaService marcacaoAgendaService;

    public MarcacaoAgendaResponse insertMarcacao(MarcacaoAgenda marcacaoAgenda){
        return MarcacaoAgendaResponse.builder().nomeMinistro(marcacaoAgenda.getNomeMinistro())
                .funcao(marcacaoAgenda.getFuncao())
                .instrumento(marcacaoAgenda.getInstrumento())
                .mes(marcacaoAgenda.getMes())
                .datasDisponiveis(marcacaoAgenda.getDatasDisponiveis())
                .build();
    }
}
