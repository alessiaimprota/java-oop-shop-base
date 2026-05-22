import java.math.BigDecimal;

import org.lessons.java.shop.Prodotto;

public class App {
    public static void main(String[] args) throws Exception {

        Prodotto libro = new Prodotto("Libro Odissea", "Lorem ipsum bklablabla", new BigDecimal(10));

        System.out.println(libro.getName());
        libro.setName("Libro diverso");
        System.out.println(libro.getName());
        System.out.println(libro.nameAndCode());

        System.out.println(libro.getDescription());
        libro.setDescription("miaomiaomiaomiao");
        System.out.println(libro.getDescription());

        System.out.println(libro.getPrice());
        libro.setPrice(new BigDecimal(100));
        System.out.println(libro.getPrice());

        System.out.println(libro.getPriceIVA());
    }

}
