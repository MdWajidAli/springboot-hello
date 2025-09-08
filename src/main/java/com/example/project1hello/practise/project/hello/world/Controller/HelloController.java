package com.example.project1hello.practise.project.hello.world.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
        private static final Logger logger = (Logger) LoggerFactory.getLogger(HelloController.class);

        @GetMapping(value = "/hello", produces = MediaType.TEXT_PLAIN_VALUE)
        public ResponseEntity<String> sayHello(){
            logger.info("GET /HELLO invoked");
            return  ResponseEntity.ok("Hello, Springboot");
        }

}
