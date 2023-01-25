import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//
//        double pi = 3.14159;
//
////        System.out.format("The value of pi is approximately %.2f", pi);
//
////        Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//
//
//
//
////        "Please enter an Integer".sout
//        System.out.println("Please enter an Integer");
//
//        int userInput = scanner.nextInt();
//
//
////        userInput.soutv
//        System.out.println("userInput = " + userInput);
//
//
//        System.out.println("Please enter three words");
//
//        String wordOne = scanner.next();
//        String wordTwo = scanner.next();
//        String wordThree = scanner.next();
//
//        System.out.println("wordOne = " + wordOne);
//        System.out.println("wordTwo = " + wordTwo);
//        System.out.println("wordThree = " + wordThree);
//
//// Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//
//        System.out.println("Please enter a Sentence");
//        scanner.nextLine();
//        String userSentence = scanner.nextLine();
//
//        System.out.println("userSentence = " + userSentence);
//
//




        Scanner sc = new Scanner(System.in);
        System.out.print("Continue? [y/N] ");
        String userInput = sc.next();




        boolean confirmation = userInput.equals("y");
        System.out.println("confirmation = " + confirmation);


    }
}
