package work.coderluka.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import work.coderluka.dependencyinjection.controllers.MyController;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

        MyController myCtrl = (MyController) ctx.getBean("myController");

        String greeting = myCtrl.sayHello();

        System.out.println(greeting);
    }

}
