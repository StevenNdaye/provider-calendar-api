package za.co.discovery.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by steven on 2014/11/18.
 */
@RestController
public class ProviderCalendarController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHelloWorld() {
        return "Hello World";
    }
}
