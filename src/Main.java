import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner psd = new Scanner(System.in);
        ArrayList<String> tallennus = new ArrayList<>();

        boolean oikein = false;
        double yht = 0;
        do {
            try {
                System.out.println("Tuotteen nimi: ");
                String tuote = psd.nextLine();
                System.out.println("Tuotteen hinta: ");
                double hinta = Double.parseDouble(psd.nextLine());
                System.out.println("Montako kappaletta?");
                int kpl = Integer.parseInt(psd.nextLine());

                hinta *= kpl;
                System.out.println("Tuotteella alv? (K/E): ");
                String alv = psd.nextLine();
                if (alv.equalsIgnoreCase("k")) {
                    hinta *= 1.24;
                }
                yht += hinta;
                tallennus.add("Tuotteen nimi: " + tuote);
                tallennus.add("Tuotteen määrä: " + kpl);
                tallennus.add("Tuotteen hinta: " + hinta);

                System.out.println("Lisätäänkö uusi tuote? (K/E)");
                String uus = psd.nextLine();
                if (uus.equalsIgnoreCase("e")) {
                    tallennus.add("Hinta yhteensä: " + yht);
                    oikein = true;
                }
            } catch (Exception e) {
                System.out.println("Vääränlainen syöte");
            }
        } while (!oikein);


        for (String x : tallennus){
            System.out.println(x);
        }
    }


}