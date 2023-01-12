package components;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ClientComponent {
    private final TransientComponentA tc;
    private final SingletonComponent sc;

    public void operation() {
        System.out.println("Invoked components.ClientComponent::operation() on " +
                this);
        System.out.println(" o components.SingletonComponent = " + sc);
        System.out.println(" o TransientComponent = " + tc);
    }
}