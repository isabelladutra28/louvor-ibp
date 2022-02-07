package com.project.ibp.louvoribp.external.configuration.mongodb;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@Data
@ConstructorBinding
@ConfigurationProperties("mongo-properties")
public class MongoDbProperties {

    private String url;

    private String database;

    private String username;

    private String password;

    private String host;

    private Integer connectionPoolMaxConnectionLifeTime;

    private Integer connectionPoolMinSize;

    private Integer connectionPoolMaxSize;

    private Integer connectionPoolMaintenanceFrequency;

    private Integer connectionPoolMaintenanceInitialDelay;

    private Integer connectionPoolMaxConnectionIdleTime;

    private Integer connectionPoolMaxWaitTime;
}
