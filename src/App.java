import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner rc = new Scanner(System.in);

        String correctName = "Paavali";
        String name = "";
        String jatko ="";
        int laskuri = 0;

        do {
        System.out.print("Arvaa nimi: (Jos haluat lopettaa, kirjoita: lopeta) ");
        name = rc.nextLine();

        laskuri++;

            if (name.equalsIgnoreCase("lopeta")) {
                System.out.println("Lopetetaan tähän.");
                laskuri--;
            } 

            else if (name.equalsIgnoreCase(correctName)) {
                System.out.println("Oikein!");
                }

            else {
                System.out.println("Vaarin!"); 
            }    

            
           // jatko = rc.nextLine();

        }
        while (!name.equalsIgnoreCase(correctName) && !name.equalsIgnoreCase("lopeta"));
        System.out.println("Arvasit " + laskuri + " kertaa.");
    }
}
