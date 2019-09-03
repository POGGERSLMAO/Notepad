import java.util.Scanner;
import java.util.ArrayList;

public class Loggbok {
    public static void main(String[] args) {
        System.out.println("Välj en av alternativen:" + "\n" +
                "1. Visa" + "\n" +
                "2. Lägg till" + "\n" +
                "3. Uppdatera" + "\n" +
                "4. Spara" + "\n" +
                "5. Läs in" + "\n" +
                "6. Avsluta");

        Scanner tgb = new Scanner(System.in);
        int choice = tgb.nextInt();

        if (choice == 1) {
            System.out.println("Detta val är inte möjligt");
        }
        if (choice == 2) {
            
            }
            if (choice == 3) {
                System.out.println("Detta val är inte möjligt");

            }
            if (choice == 4) {
                System.out.println("Detta val är inte möjligt");
            }
            if (choice == 5) {
                System.out.println("Detta val är inte möjligt");
            }
            if (choice == 6) {
                System.exit(1);


            }
        }
    }
