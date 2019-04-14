package io.ankitgit.runner.scheduler;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;


@Component
public class LoadConsumer {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Scheduled(fixedRate = 5000)
    public void consumeMessage() throws IOException {

        System.out.printf("Hey Ho Hey Ho");
    }


}
