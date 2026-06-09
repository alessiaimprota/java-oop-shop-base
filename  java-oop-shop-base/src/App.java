import java.math.BigDecimal;

import org.lessons.java.shop.Prodotto;
import org.lessons.java.shop.Smartphone;

public class App {
    public static void main(String[] args) throws Exception {

        Smartphone Samsung26 = new Smartphone("s26 Ultra", "enorme assurdo telefono", new BigDecimal("199.99"), 06546,
                1);

        System.out.println(Samsung26.toString());
    }

}
