import java.util.Scanner;

public class loggBok {
    public static void main(String[] args) {
        System.out.println( "Välj en av alternativen nedan:" + "\n" +
                "1. Visa" +"\n" +
                "2. Lägg till post" + "\n" +
                "3. Uppdatera" + "\n" +
                "4. Spara" + "\n" +
                "5. Läs in" + "\n" +
                "6. Avsluta");

        Scanner tgb = new Scanner(System.in);
        int val = tgb.nextInt();

        if (val == 1) {
            System.out.println("Detta val är inte tillgängligt");
        }
        if (val == 2) {
            System.out.println("Detta val är inte tillgängligt");
        }
        if (val == 3) {
            System.out.println("Detta val är inte tillgängligt");
        }
        if (val == 4) {
            System.out.println("Detta val är inte tillgängligt");
        }
        if (val == 5) {
            System.out.println("Detta val är inte tillgängligt");
        }
        if (val == 6) {
            System.out.println("Detta val är inte tillgängligt");
        } else {
            System.out.println("Välj ett nummer mellan 1 - 6 istället");
        }

    }
}
