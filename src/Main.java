import java.util.Scanner;

    import java.util.*;

//In this project, you'll design and implement a Java program for a number guessing game with multiple difficulty levels. Players will try to guess a randomly generated number within different ranges based on the chosen difficulty level. Project parameters:
//        User Interaction: Prompt the user to play and choose a difficulty level.
//        Game Logic: Generate a random number within the selected difficulty's range. Allow the player to input their guess and compare it to the generated number. Implement logic to determine if the guess is correct or incorrect and tell the user higher or lower.

    public class Main {
        public static void main(String[] args) {
            boolean yesNo = ask();
            if (yesNo)  {
                System.out.println("play");
            }
            else {
                ask();
            }

        }
        public static boolean ask(){
            Scanner play = new Scanner(System.in);
            System.out.println("Play? (Yes/No)");
            String x = play.nextLine();

            if (x.toLowerCase().equals("yes")) {
                return true;
            }
            else if (x.toLowerCase().equals("no")) {
                return false;
            }

            else {
                return ask();
            }

        }

    }


