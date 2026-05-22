import java.math.BigDecimal;

import org.lessons.java.shop.Prodotto;

public class App {
    public static void main(String[] args) throws Exception {

        Prodotto libro = new Prodotto("Libro Odissea", "Lorem ipsum bklablabla", new BigDecimal(10),
                new BigDecimal(0.22));

        System.out.println(libro.nameAndCode());
        System.out.println(libro.getPrice());
        System.out.println(libro.getPriceIVA());

    }
}
