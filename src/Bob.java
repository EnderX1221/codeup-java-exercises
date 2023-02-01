import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean cont;


        do {
            System.out.println("Say something to Bob:");
            String userInput = scan.nextLine();

            if (userInput.endsWith("?")) {
                System.out.println("yes");
            } else if (userInput.endsWith("!")) {
                System.out.println("hey careful!");
            } else if (userInput.endsWith(" ")) {
                System.out.println("Take it easy");
            } else {
                System.out.println("Whatever.");
            }

            System.out.println("Would you like to keep talking to Bob? {Y/N}");
            String contInput = scan.nextLine();

            if (contInput.equalsIgnoreCase("Y")) {
                cont = true;
            } else {
                cont = false;
            }

            scan.nextLine();

        } while (cont);

    }
}