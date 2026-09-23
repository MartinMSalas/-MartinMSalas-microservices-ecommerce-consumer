package ar.microservices.communication.consumer.httpinterface;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

/*
 * Author: m
 * Date: 23/9/26
 * Project Name: Communication
 * Description: beExcellent
 */
@HttpExchange
public interface ProviderWebClientHttpInterface {

    @GetExchange("/instance-info")
    String getInstanceInfo();
}
