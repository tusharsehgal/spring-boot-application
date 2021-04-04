import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloWorld() {
        return "I am happy in my new Spring boot docker world";
    }

    public static void main(String[] args) {
        String str = "hello";
        try {

            System.out.println(str);
            throw new Error();
        }
        catch (Exception e){
            System.out.println("tus");
        }
    }
}
