package ar.microservices.communication.consumer.resttemplate;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Author: m
 * Date: 9/16/26
 * Project Name: communication
 * Description: beExcellent
 */
@RestController
@RequestMapping("/api/rest-template")
@RequiredArgsConstructor
public class RestTemplateController {

    private final RestTemplateClient restClient;

    @GetMapping("/instance")
    public String getInstance(){

        String response = restClient.getInstanceInfo();

        return response;
    }
}
