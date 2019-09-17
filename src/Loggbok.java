import java.util.ArrayList;
import java.util.Scanner;

public class Loggbok {
    public static void main(String[] args) {
        ArrayList<String> post = new ArrayList<String>();
        Scanner tgb = new Scanner(System.in);
        boolean running = true;

        while (running) {
            printMenu();
            running = val(post, tgb);
        }
    }

    private static boolean val(ArrayList<String> post, Scanner tgb) {
        int val = tgb.nextInt();
        String gamermoment = tgb.nextLine();

        switch(val) {
            case 1:
                System.out.println("Visa");
                show(post);
                break;
            case 2:
                System.out.println("Lägg till");
                add(post, tgb);

                break;
            case 3:
                System.out.println("Uppdatera");
                break;
            case 4:
                System.out.println("Spara");
                break;
            case 5:
                System.out.println("Läs");
                break;
            case 6:
                System.out.println("Bye");
            System.exit(0);

            default:
                System.out.println("Detta val är inte tillgängligt");
                break;
        }
        return true;
    }

    private static void show(ArrayList<String> postlista) {
        System.out.println(postlista + "\n");
    }

    private static void printMenu() {
        System.out.println("Välj ett av alternativen nedan:"+"\n"+
                "1. Visa"+"\n"+
                "2. Lägg till post"+"\n"+
                "3. Uppdatera"+"\n"+
                "4. Spara"+"\n"+
                "5. Läs in"+"\n"+
                "6. Avsluta");
    }

    private static void add(ArrayList<String> post, Scanner tgb) {
        String posta = tgb.nextLine();
        post.add(posta);


    }
}
