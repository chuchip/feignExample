package com.profesorp.feign;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("server")
public class ServerController {

    @GetMapping("{httpCode}")
    ResponseEntity<OutputDto> getHttpCode(@PathVariable int httpCode)
    {
        System.out.println("En server. Devolvere: "+httpCode);
        return ResponseEntity.status(httpCode).body(new OutputDto(httpCode,"Devuelto por server"));
    }

}
