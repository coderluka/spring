package work.coderluka.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("DE")
@Service("i18nService")
public class I18nGermanGreetingService implements GreetingService {
    @Override
    public String sayGreet() {
        return "Gutten Tag - DE";
    }
}
