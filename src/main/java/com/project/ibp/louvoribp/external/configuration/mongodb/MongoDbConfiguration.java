package com.project.ibp.louvoribp.external.configuration.mongodb;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

@Slf4j
@RequiredArgsConstructor
@Configuration
public class MongoDbConfiguration {

    private final MongoDbProperties mongoDbProperties;

}
