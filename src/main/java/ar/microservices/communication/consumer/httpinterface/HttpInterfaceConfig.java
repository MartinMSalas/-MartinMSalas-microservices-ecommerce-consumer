package ar.microservices.communication.consumer.httpinterface;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

/*
 * Author: m
 * Date: 23/9/26
 * Project Name: Communication
 * Description: beExcellent
 */
@Configuration
public class HttpInterfaceConfig {

    @Bean
    public ProviderWebClientHttpInterface webClientHttpInterface() {
        WebClient webClient = WebClient.builder().baseUrl("http://localhost:9091").build();
        WebClientAdapter adapter = WebClientAdapter.create(webClient);

        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();

        ProviderWebClientHttpInterface service = factory.createClient(ProviderWebClientHttpInterface.class);

        //WebCLientAdapter
        return service;
    }

    @Bean
    public ProviderRestClientHttpInterface restClientHttpInterface() {

        RestClient restClient = RestClient.builder().baseUrl("http://localhost:9091").build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);

        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();

        ProviderRestClientHttpInterface service = factory.createClient(ProviderRestClientHttpInterface.class);

        //WebCLientAdapter
        return service;
    }

}
