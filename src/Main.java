import java.util.*;

//In this project, you'll design and implement a Java program for a number guessing game with multiple difficulty levels. Players will try to guess a randomly generated number within different ranges based on the chosen difficulty level. Project parameters:
//        User Interaction: Prompt the user to play and choose a difficulty level.
//        Game Logic: Generate a random number within the selected difficulty's range. Allow the player to input their guess and compare it to the generated number. Implement logic to determine if the guess is correct or incorrect and tell the user higher or lower.

    public class Main {
        public static int score = 0;
        public static void main(String[] args) {

            boolean yesNo = ask();
            if (yesNo)  {
                play();
            }
            else {
                ask();
            }

        }
        public static boolean ask(){
            Scanner play = new Scanner(System.in);
            System.out.println("Play? (Yes/No)");
            String x = play.nextLine();

            if (x.toLowerCase().strip().equals("yes")) {
                return true;
            }
            else if (x.toLowerCase().strip().equals("no")) {
                return false;
            }

            else {
                return ask();
            }

        }

        public static int levelSelect(){
            Scanner getInt = new Scanner(System.in);
            System.out.println("Which difficulty level do would you like to play? [1, 2, 3]");

            return getInt.nextInt();
        }

        public static void play(){
            int x = levelSelect();

            try {
                if (x == 1){
                    levelOne();
                }
                else if (x == 2){
                    levelTwo();
                }
                else {
                    levelThree();
                }
            }
            catch (Exception e){
                System.out.println("Invalid Response.");
                levelSelect();
            }
        }

        public static int guessModule(){
            Scanner input = new Scanner(System.in);
            System.out.println("What is your guess? ");
            int guess = input.nextInt();
            return guess;
        }

        //level one
        public static void levelOne() {
            int toGuess = (int)(Math.random() * 11);

            System.out.println("Range is between 0 - 10");

            System.out.println(toGuess);

            int guess = guessModule();

            if (guess == toGuess) {
                System.out.println("gg");
                System.out.println("you earned a point");
                score++;
                System.out.println("score: " + score);

                play();
            }
            else if (guess > toGuess) {
                System.out.println("incorrect.");
                System.out.println("number is lower.");
                guessModule();
            }
           else {
                System.out.println("incorrect.");
                System.out.println("number is higher.");
                guessModule();
            }

            }

        //level two
        public static void levelTwo() {
            int toGuess = (int)(Math.random() * 51);

            System.out.println("Range is between 0 - 50");

            int guess = guessModule();


            if (guess == toGuess) {
                System.out.println("gg");
                System.out.println("you earned a point");
                score++;
                System.out.println("score: " + score);

                play();
            }
            else if (guess > toGuess) {
                System.out.println("incorrect.");
                System.out.println("number is lower.");
                guessModule();
            }
            else {
                System.out.println("incorrect.");
                System.out.println("number is higher.");
                guessModule();
            }

        }
        //level three
        public static void levelThree() {
            int toGuess = (int)(Math.random() * 51);

            System.out.println("Range is between 0 - 100");

            int guess = guessModule();


            if (guess == toGuess) {
                System.out.println("gg");
                System.out.println("you earned a point");
                score++;
                System.out.println("score: " + score);

                play();
            }
            else if (guess > toGuess) {
                System.out.println("incorrect.");
                System.out.println("number is lower.");
                guessModule();
            }
            else {
                System.out.println("incorrect.");
                System.out.println("number is higher.");
                guessModule();
            }

        }


        }




