package com.profesorp.feign;

import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component

public class FeignFallback  implements IFeignServer{
        @Override
        public ResponseEntity<OutputDto> callServer(int httpCode)
        {
            return ResponseEntity.ok(new OutputDto(501,"Devuelto por fallback"));
        }
}
