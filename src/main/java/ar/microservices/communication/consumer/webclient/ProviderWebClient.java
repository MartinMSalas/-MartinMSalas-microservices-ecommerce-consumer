package ar.microservices.communication.consumer.webclient;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/*
 * Author: m
 * Date: 9/22/26
 * Project Name: communication
 * Description: beExcellent
 */
@Service
@RequiredArgsConstructor
public class ProviderWebClient {

    private final WebClient webClient;

    public Mono<String> getInstanceInfo() {
        return webClient.get()
                .uri("/instance-info")
                .retrieve()
                .bodyToMono(String.class);
    }


}
