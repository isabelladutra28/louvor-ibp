package com.project.ibp.louvoribp.core.services;

import com.project.ibp.louvoribp.core.domain.ministro.Ministro;
import com.project.ibp.louvoribp.core.domain.ministro.MinistroRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class MinistroService {

    private final MinistroRepository ministroRepository;

    public Ministro inserMinistro(Ministro ministro){
        return ministroRepository.inserMinistro(ministro);
    }

}
