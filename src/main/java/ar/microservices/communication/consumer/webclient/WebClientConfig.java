package ar.microservices.communication.consumer.webclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/*
 * Author: m
 * Date: 9/22/26
 * Project Name: communication
 * Description: beExcellent
 */
@Configuration
public class WebClientConfig {

    @Bean
    public WebClient webClient(){

        return WebClient.builder()
                .baseUrl("http://localhost:9091")
                .build();
    }
}
