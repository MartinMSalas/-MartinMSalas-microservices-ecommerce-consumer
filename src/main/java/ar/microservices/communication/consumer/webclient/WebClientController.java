package ar.microservices.communication.consumer.webclient;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/*
 * Author: m
 * Date: 23/9/26
 * Project Name: Communication
 * Description: beExcellent
 */
@RestController
@RequestMapping("/api/web-client")
@RequiredArgsConstructor
public class WebClientController {

    private final ProviderWebClient providerWebClient;

    @GetMapping("/instance")
    public Mono<String> getInstance() {

//        WebClient webClient = WebClient.create();
//
//        Mono<String> response = webClient.get()
//                .uri("http://localhost:9091/instance-info")
//                .retrieve()
//                .bodyToMono(String.class);
        //System.out.println("Instance info: " + response.block());
        //return response;

        return providerWebClient.getInstanceInfo();
    }
}
