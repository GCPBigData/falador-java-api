package br.falador.controller;

import br.falador.services.ConsumerService;
import br.falador.services.ProducerService;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 08/07/2020
 */

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(value = "kafka")
public class KafkaController {

    private final ProducerService producerService;
    private final ConsumerService consumerService;

    KafkaController(ProducerService producerService, ConsumerService consumerService) {
        this.producerService = producerService;
        this.consumerService = consumerService;
    }

    @PostMapping(value = "/publica")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        this.producerService.produceMessage(message);
    }

    @GetMapping(value = "/consome")
    public void getMessageToKafkaTopic(@RequestParam("message") String message) throws IOException {
        this.consumerService.consomeMessage(message);
    }
}