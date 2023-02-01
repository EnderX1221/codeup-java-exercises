package Movies;
import util.Input;
import java.util.Arrays;

public class MoviesApplication {
    public static void movies(){
        boolean decision = true;
        Movie[] movieArray = MoviesArray.findAll();
        Input input = new Input();
        while (decision) {
            System.out.println("What would you like to do?\n");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the sci-fi category");
            int choice = input.getInt(0,5);
            switch (choice) {
                case (0):
                    System.out.println("Do you really want to quit?");
//                    input.clear();
                    boolean confirm = input.yesNo();
                    if (confirm) {
                        System.out.println("Have a nice day....");
                        decision = false;
                    }else{
                        System.out.println("Restarting....");
                    }
                    break;
                case(1):
                    for (Movie movie : movieArray){
                        System.out.println(movie.getName() + " --- " + movie.getCategory());
                    }
                    break;
                case(2):
                    for (Movie movie : movieArray){
                        if(movie.getCategory().equals("animated")){
                            System.out.println(movie.getName() + " --- " + movie.getCategory());
                        }
                    }
                    break;
                case(3):
                    for (Movie movie : movieArray){
                        if(movie.getCategory().equals("drama")){
                            System.out.println(movie.getName() + " --- " + movie.getCategory());
                        }
                    }
                    break;
                case(4):
                    for (Movie movie : movieArray){
                        if(movie.getCategory().equals("horror")){
                            System.out.println(movie.getName() + " --- " + movie.getCategory());
                        }
                    }
                    break;
                case(5):
                    for (Movie movie : movieArray){
                        if(movie.getCategory().equals("scifi")){
                            System.out.println(movie.getName() + " --- " + movie.getCategory());
                        }
                    }
                    break;
                default:
                    System.out.println("Please Wait..");
                    break;
            }
        }
    }
    public static void main(String[] args){
        movies();
    }
}