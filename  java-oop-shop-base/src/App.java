import java.math.BigDecimal;

import org.lessons.java.shop.Prodotto;
import org.lessons.java.shop.Smartphone;
import org.lessons.java.shop.Televisore;
import org.lessons.java.shop.Cuffie;

public class App {
    public static void main(String[] args) throws Exception {

        Smartphone Samsung26 = new Smartphone("s26 Ultra", "enorme assurdo telefono", new BigDecimal("199.99"), 06546,
                1);
        System.out.println(Samsung26.toString());

        Televisore SamsungOled = new Televisore("SamsungOled", "Televisore enorme me lo metto nel salone",
                new BigDecimal("1000.99"), 70, true);
        System.out.println(SamsungOled.toString());
        SamsungOled.setIsSmart(false);
        System.out.println(SamsungOled.toString());

        Cuffie Hyperx = new Cuffie("HyperX", "Si sente tutto assurdo", new BigDecimal("122.22"), "Rosse", true);
        System.out.println(Hyperx.toString());
        Hyperx.setColore("Bianche");
        System.out.println(Hyperx.toString());
    }

}
