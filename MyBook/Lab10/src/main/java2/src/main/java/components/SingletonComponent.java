package components;

import org.springframework.stereotype.Component;

@Component

public class SingletonComponent {
    public SingletonComponent() {
        System.out.println(
                "components.SingletonComponent::components.SingletonComponent = " + this);

    }
    public void operation() {
        System.out.println(
                "Invoked components.SingletonComponent::operation() on " + this);

    }
}