package work.coderluka.dependencyinjection.controllers;

import org.springframework.stereotype.Controller;
import work.coderluka.dependencyinjection.services.GreetingService;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreet();
    }
}
