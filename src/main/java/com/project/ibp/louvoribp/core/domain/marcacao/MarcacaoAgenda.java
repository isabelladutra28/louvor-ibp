package com.project.ibp.louvoribp.core.domain.marcacao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.With;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document
@EqualsAndHashCode
@Getter
@Builder
@With
public class MarcacaoAgenda implements Serializable {

    @MongoId
    private final String id;

    private final String nomeMinistro;

    private final FuncaoEnum funcao;

    private final InstrumentoEnum instrumento;

    private final String mes;

    private final List<Date> datasDisponiveis;

}
