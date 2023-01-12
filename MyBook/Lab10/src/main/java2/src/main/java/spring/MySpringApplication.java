package spring;

import components.ClientComponent;
import components.SingletonComponent;
import components.TransientComponentA;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"components", "controllers"})  //NU VA STIE SA LE IA ALTFEL FOR SOME REASON
public class MySpringApplication {
    public static void main(String[] args) {
//
// Run this main function and inspect the output console

// to learn about
// the lifecycle of objects within
// Spring Dependency Injection Context
//
// Gets a handle of dependency injection context
        ApplicationContext context =
                SpringApplication.run(MySpringApplication.class, args);


// Gets an instance of TransientComponent from the DI context
        TransientComponentA transientBean =
                context.getBean(TransientComponentA.class);
        transientBean.operation();
// Note that every time an instance is required,
// the DI context creates a new one
        transientBean = context.getBean(TransientComponentA.class);
        transientBean.operation();
// Gets an instance of components.SingletonComponent from the DI context
// Note that the unique instance was created while
// application was loaded, before creating
// the transient instances
        SingletonComponent singletonBean =
                context.getBean(SingletonComponent.class);
        singletonBean.operation();
// Note that every time an instance is required,
// the DI returns the same unique one
        singletonBean = context.getBean(SingletonComponent.class);
        singletonBean.operation();
// Gets an instance of another class that
// requires singleton/transient components
// Note where this instance was created and what beans
// were used to initialize it
        ClientComponent c = context.getBean(ClientComponent.class);
        c.operation();
// One can also request an instance from DI context by name
        c = (ClientComponent)context.getBean("clientComponent");
        c.operation();
    }

}