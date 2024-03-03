package StringPart1;
import java.util.UUID;

public class RandomStringGenerator {
    public static void main(String[] args) {
        
        String x = "ZOID" + UUID.randomUUID().toString().replaceAll("[a-zA-Z]", "").replaceAll("-", "");
        System.out.println(x);
    }
}
