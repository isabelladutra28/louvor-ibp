package com.project.ibp.louvoribp.external.controllers;

import com.project.ibp.louvoribp.core.domain.ministro.Ministro;
import com.project.ibp.louvoribp.external.controllers.dto.ministro.MinistroResponse;
import com.project.ibp.louvoribp.external.controllers.handlers.MinistroHandler;
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
@RequestMapping("/ministros")
public class MinistroController {

    private final MinistroHandler ministroHandler;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MinistroResponse> inserMinistro(@RequestBody Ministro ministro){
        return ResponseEntity.ok().body(ministroHandler.inserMinistro(ministro));
    }
}
