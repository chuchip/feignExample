package com.profesorp.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")
public class ClientController {
    @Autowired
    IFeignServer iFeignServer;

    @GetMapping("{code}")
    ResponseEntity<OutputDto> callUsingFeign(@PathVariable int code)
    {
        System.out.println("En client. Devolvere: "+code);
        return iFeignServer.callServer(code);
    }
}
