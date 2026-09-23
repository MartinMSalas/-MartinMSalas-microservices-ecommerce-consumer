package ar.microservices.communication.consumer.httpinterface;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Author: m
 * Date: 23/9/26
 * Project Name: Communication
 * Description: beExcellent
 */
@RestController
@RequestMapping("/api/http-client")
@RequiredArgsConstructor
public class HttpInterfaceController {

    private final ProviderWebClientHttpInterface webClientprovider;
    private final ProviderRestClientHttpInterface restClientProvider;

    @GetMapping("/instance")
    public String getInstanceInfo() {

        return webClientprovider.getInstanceInfo();

    }

    @GetMapping("/instance2")
    public String getInstanceInfo2() {
        return restClientProvider.getInstanceInfo();
    }

}
