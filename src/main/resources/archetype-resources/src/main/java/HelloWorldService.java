package jakarta-ee.sample;
import jakarta.ejb.Stateless;

@Stateless
public class HelloService {
    public String  createHelloMessage(String name) throws Exception {
        return "Hello "+name;
    }
}