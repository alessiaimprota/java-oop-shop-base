import java.math.BigDecimal;

import org.lessons.java.shop.Prodotto;

public class App {
    public static void main(String[] args) throws Exception {

        Prodotto cream = new Prodotto();

        cream.name = "Crema Anti-age";
        cream.description = "lorem ciao ciao";
        cream.price = new BigDecimal(10);
        cream.IVA = new BigDecimal(0.22);

        System.out.println(cream.nameAndCode());
        System.out.println(cream.getPrice());
        System.out.println(cream.getPriceIVA());

    }
}
