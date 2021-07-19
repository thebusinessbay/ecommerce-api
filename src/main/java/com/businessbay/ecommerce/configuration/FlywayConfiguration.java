package com.businessbay.ecommerce.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("com.businessbay.core.db.repository")
public class FlywayConfiguration {

        @Bean(name = "properties")
        @ConfigurationProperties("spring.datasource")
        DataSourceProperties dataSourceProperties() {
            return new DataSourceProperties();
        }
}