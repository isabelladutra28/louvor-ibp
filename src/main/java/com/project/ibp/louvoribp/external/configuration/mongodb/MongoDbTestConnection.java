package com.project.ibp.louvoribp.external.configuration.mongodb;

import com.project.ibp.louvoribp.core.domain.commons.GenericRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@RequiredArgsConstructor
@Configuration
public class MongoDbTestConnection {

    private final GenericRepository genericRepository;

    @Scheduled(cron = "0 */1 * * * *", zone = "America/Sao_Paulo")
    public void openConnectionListener() {
        this.genericRepository.testConnectionPooling();
    }
}
