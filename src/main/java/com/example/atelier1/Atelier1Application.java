package com.example.atelier1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@SpringBootApplication
@Slf4j
@Service
@EnableAspectJAutoProxy
public class Atelier1Application {

    public static void main(String[] args) {
        SpringApplication.run(Atelier1Application.class, args);
       // log.info("Simple log statement with inputs {}, {} and {}", 1, 2, 3);


    }


}
