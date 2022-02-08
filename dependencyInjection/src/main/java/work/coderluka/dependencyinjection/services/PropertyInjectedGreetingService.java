package work.coderluka.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService {

    @Override
    public String sayGreet() {
        return "Hello World - Property";
    }
}
