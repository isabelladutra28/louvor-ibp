package com.project.ibp.louvoribp.external.controllers.dto.ministro;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MinistroResponse implements Serializable {

    private String nome;
}
