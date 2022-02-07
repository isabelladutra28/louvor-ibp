package com.project.ibp.louvoribp.external.controllers;

import com.project.ibp.louvoribp.core.domain.marcacao.MarcacaoAgenda;
import com.project.ibp.louvoribp.external.controllers.dto.marcacaoagenda.MarcacaoAgendaResponse;
import com.project.ibp.louvoribp.external.controllers.handlers.MarcacaoAgendaHandler;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/marcacao-agenda")
public class MarcacaoAgendaController {

    private final MarcacaoAgendaHandler marcacaoAgendaHandler;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MarcacaoAgendaResponse> insertMarcacao(@RequestBody MarcacaoAgenda marcacaoAgenda){
        return ResponseEntity.ok().body(marcacaoAgendaHandler.insertMarcacao(marcacaoAgenda));
    }
}
