import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame2 {


    public static void main(String[] args){
//        int pickedNumber;
//        pickedNumber= (int) (Math.random()*100);
//        System.out.println(pickedNumber);

       Scanner keyboard;
       String again;

       keyboard= new Scanner(System.in);



       do {
           System.out.println("Hello and welcome to the Number Guessing Game.");
           System.out.println("Pick a number: ");

           Scanner inputnum = new Scanner(System.in);
           int maxnum;
           maxnum = inputnum.nextInt();


           Random rand = new Random();
           int number = rand.nextInt(maxnum);
           int tries = 0;
           Scanner input = new Scanner(System.in);
           int guess;
           boolean win = false;

           while (win == false) {

               System.out.println("Guess a number between 1 and " + maxnum + ": ");
               guess = input.nextInt();
               tries++;

               if (guess == number) {
                   win = true;
               } else if (guess < number) {
                   System.out.println("Number is to low, try again");

               } else if (guess > number) {
                   System.out.println("Number is to high, try again");

               }

           }

           System.out.println("You win!");
           System.out.println("It took you " + tries + " tries.");


           System.out.println("would you like to play again (yes or no).");
           again = keyboard.next();

       } while (again.equals("yes"));
            System.out.println("Goodbye");




    }
}
