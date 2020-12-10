package ${package};
import jakarta.ejb.Stateless;

@Stateless
public class HelloWorldService {
    public String createHelloMessage(String name) {
        return "Hello " + name;
    }
}