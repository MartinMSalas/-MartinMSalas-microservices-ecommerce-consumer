package ar.microservices.communication.consumer.restclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

/*
 * Author: m
 * Date: 9/22/26
 * Project Name: communication
 * Description: beExcellent
 */
@Configuration
public class RestClientConfig {

    @Bean
    public RestClient restClient(RestClient.Builder builder){

        return builder.baseUrl("http://localhost:9091")
                .build();
    }
}
