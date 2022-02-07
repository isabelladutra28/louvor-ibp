package com.project.ibp.louvoribp.external.controllers.dto.marcacaoagenda;

import com.project.ibp.louvoribp.core.domain.marcacao.FuncaoEnum;
import com.project.ibp.louvoribp.core.domain.marcacao.InstrumentoEnum;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class MarcacaoAgendaResponse implements Serializable {

    private String nomeMinistro;

    private FuncaoEnum funcao;

    private InstrumentoEnum instrumento;

    private String mes;

    private List<Date> datasDisponiveis;


}
