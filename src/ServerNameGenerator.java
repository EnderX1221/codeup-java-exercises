import java.util.Random;

public class ServerNameGenerator {

    //    2.ServerNameGenerator
//    Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
//    Create a method that will return a random element from an array of strings.
    public static String randomNum(String[] array) {
        Random rand = new Random();
        int indexVal = rand.nextInt(array.length) +1 ;
//    int indexVal = new Random().nextInt(array.length); //without initialization of new random
        return array[indexVal];
    }
    //    Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
//            Example Output
//
//    Here is your server name:
//    dedicated-photon
//
    public static void main(String[] args) {
        String[] adjectives = {"just", "firey", "acidic", "sour", "intrepid", "slow", "giant", "smartest", "singular", "old" };
        String[] arrayNoun = {"chicken", "pond", "dragon", "salt", "ocean", "juice", "paper", "typewriter", "power", "basement"};
//    System.out.print(randomNum(adjectives));
        System.out.printf("Your server name is: %s-%s",randomNum(adjectives), randomNum(arrayNoun) );


    }
}