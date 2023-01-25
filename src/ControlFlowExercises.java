import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {


        // ------------------------
        // While loop
        // -Create an integer variable i with a value of 5.
        // --------------
        int i = 5;
        // ----------------
        // -Create a while loop that runs so long as i is less than or equal to 15
        // - Each loop iteration, output the current value of i, then increment i by
        // one.
        // ----------------
        while (i < 15) {
            System.err.println("i is: " + i);
            i++;
        }
        // ----------------
        // Do While
        // Create a do-while loop that will count by 2's starting with 0 and ending at
        // 100. Follow each number with a new line.
        // ---------------
        int a = 0;
        do {
            System.out.println("A is loop: " + a);
            a += 2;
        } while (a < 100);
        // -----------
        // Alter your loop to count backwards by 5's from 100 to -10.
        // -----------
        int j = 100;
        do {
            System.out.println("J is loop: " + j);
            j -= 5;
        } while (j > -11);
        // -------------------
        // -Create a do-while loop that starts at 2, and displays the number squared on
        // each line while the number is less than 1,000,000. Output should equal:
        // --------------
        long k = 2;
        do {
            System.out.println("K is loop: " + k);
            k = k * k;
        } while (k <= 1000000);
        // For
        // -Refactor the previous two exercises to use a for loop instead.
        // ----------------------------
        for (int l = 5; l <= 15; l++) {
            System.out.println(l);
        }
        for (long m = 2; m <= 1000000; m = m * m) {
            System.out.println(m);
        }

        for (int n = 1; n <= 100; n++) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (n % 3 == 0) {
                System.out.println("Fizz");
            } else if (n % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(n);
            }
        }


        Scanner scanner = new Scanner(System.in);
//
//        boolean confirmation;
//
//
//        do {
//
//            System.out.println("What number would you like to go up to?");
//            int userInt = scanner.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println("number | squared | cubed\n------ | ------- | -----");
//
//            for(int i = 1; i <= userInt; i++){
//                int square = i * i;
//                int cubed = i * i * i;
//                System.out.printf("%-7d|%-9d|%-6d\n", i, square, cubed);
//            }
//            System.out.print("Continue? [Y/N] ");
//            String userInput = scanner.next();
//            confirmation = userInput.equalsIgnoreCase("Y");
//        } while(confirmation);
//        System.out.println("Cool. See you next time!");


//
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0

        boolean confirmation;

        do {
            System.out.print("Input a numerical grade from 0 to 100: ");
            int userGrade = scanner.nextInt();

            if(userGrade >= 88){
                System.out.println("A");
            } else if(userGrade >= 80){
                System.out.println("B");
            } else if(userGrade >= 67){
                System.out.println("C");
            } else if(userGrade >= 60){
                System.out.println("D");
            } else {
                System.out.println("F");
            }
            System.out.print("Continue? [Y/N] ");
            String userInput = scanner.next();
            confirmation = userInput.equalsIgnoreCase("Y");

        } while(confirmation);
        System.out.println("goodbye");

    }

}