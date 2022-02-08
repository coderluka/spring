package work.coderluka.dependencyinjection.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import work.coderluka.dependencyinjection.services.ConstructorGreetingService;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController((new ConstructorGreetingService()));
    }

    @Test
    void getGreet() {
        System.out.println(controller.getGreet());
    }
}