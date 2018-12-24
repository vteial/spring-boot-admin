package io.wybis.wss.web.controllers

import groovy.util.logging.Slf4j
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@Slf4j
public class DefaultController {

    @RequestMapping(value = '/ping', method = RequestMethod.GET)
    public @ResponseBody
    Map<String, String> ping() {
        Map<String, String> map = [:];

        map.put('ping', 'Ping Pong!!!');

        return map;
    }

}
