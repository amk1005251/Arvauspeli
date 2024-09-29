import java.util.Scanner;


public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("ä, ö, å, Ä, Ö, Å");

        Scanner rc = new Scanner(System.in);

        String correctName = "Paavali";
        String name = "";
        String jatko = "";                                  // stilisoitiin muotoilua
        int laskuri = 0;

        do {
        System.out.print("Arvaa nimi: (Jos haluat lopettaa, kirjoita: lopeta) ");
        name = rc.nextLine();

        laskuri++;

        // lisätään lopetusmahdollisuus tähän väliin

            if (name.equalsIgnoreCase("lopeta")) {
                System.out.println("Lopetetaan tähän.");
                laskuri--;                                      // muista huolehtia oikeasta arvausmäärästä
            } 

            else if (name.equalsIgnoreCase(correctName)) {      // IgnoreCase pitää olla myös ehtolauseessa jotta koodi toimii oikein
                System.out.println("Oikein!");
                }

            else {
                System.out.println("Vaarin! Kirjoitit " + name); 
            }    

        }
        while (!name.equalsIgnoreCase(correctName) && !name.equalsIgnoreCase("lopeta"));
        System.out.println("Arvasit " + laskuri + " kertaa.");
    }
}


