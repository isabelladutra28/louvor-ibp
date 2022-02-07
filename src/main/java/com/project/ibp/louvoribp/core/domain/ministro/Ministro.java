package com.project.ibp.louvoribp.core.domain.ministro;

import java.io.Serializable;
import java.lang.annotation.Documented;
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
public class Ministro implements Serializable {

    @MongoId
    private final String id;

    private final String nome;

}
