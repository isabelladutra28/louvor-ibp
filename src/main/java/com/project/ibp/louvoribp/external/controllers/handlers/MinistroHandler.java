package com.project.ibp.louvoribp.external.controllers.handlers;

import com.project.ibp.louvoribp.core.domain.ministro.Ministro;
import com.project.ibp.louvoribp.core.services.MinistroService;
import com.project.ibp.louvoribp.external.controllers.dto.ministro.MinistroResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class MinistroHandler {

    private final MinistroService ministroService;

    public MinistroResponse inserMinistro(Ministro ministro){
        return MinistroResponse.builder()
                .nome(ministro.getNome()).build();
    }
}
