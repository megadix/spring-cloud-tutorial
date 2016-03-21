package it.megadix.springcloudtut;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class GreetingController {

    private static Logger log = LoggerFactory.getLogger(GreetingController.class);

    @Value("${message}")
    private String message;

    @RequestMapping(path = "/greeting")
    public String greeting(@RequestParam(name = "name") String name) {
        String result = String.format(message, name);
        log.info(result);
        return result;
    }
}
