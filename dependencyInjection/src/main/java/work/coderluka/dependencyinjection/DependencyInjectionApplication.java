package work.coderluka.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import work.coderluka.dependencyinjection.controllers.ConstructorInjectedController;
import work.coderluka.dependencyinjection.controllers.MyController;
import work.coderluka.dependencyinjection.controllers.PropertyInjectedController;
import work.coderluka.dependencyinjection.controllers.SetterInjectedController;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

        // inversion of control: controller managed by spring context (framework provides the obj I do not use new)
        MyController myCtrl = (MyController) ctx.getBean("myController");

        System.out.println("---- Primary Bean");
        System.out.println(myCtrl.sayHello());

        System.out.println("----- Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreet());

        System.out.println("----- Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreet());

        System.out.println("----- Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreet());
    }

}
