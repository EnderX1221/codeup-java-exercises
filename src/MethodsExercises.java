import java.util.Scanner;

public class MethodsExercises {

    public static int addition (int a, int b) {
        return a + b;
    }

//    #2

    public static int getInteger ( int min, int max) { //Provided
        Scanner myObj = new Scanner(System.in);  // Creating a Scanner object
        System.out.print("Enter a number between " + min + " and " + max + ":"); //Provided
        int userInput = myObj.nextInt();

        if (userInput <= max && userInput >= min) {
            System.out.println("That is the correct number!");
        } else {
            getInteger(min, max); //recursion
        }
        return userInput;
    }

    public static void main(String[] args) {
//        int a = 6;
//        int b = 3;
//
//        int sum = a + b;
//        int difference = a - b;
//        int quotient = a / b;
//        int product = a * b;
//        int modulus = a % b;
//
//        System.out.println("The sum of adding (a) and (b) is: " + sum);
//        System.out.println("The difference between (a) minus (b) is: " + difference);
//        System.out.println("The quotient of (a) divided by (b) is: " + quotient);
//        System.out.println("The product of (a) times (b) is: " + product);
//        System.out.println("The remainder after dividing (a) by (b) is: " + modulus);

        System.out.println(addition(1, 2));

        System.out.println(getInteger(1, 10));


    }//end main
}//end class


