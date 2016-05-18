package io.bryantcason;
import java.util.Scanner;

public class Game {
    public int secretNumber;
    public int counter = 0;
    public int currentGuess;
    public int previousGuess;



    public void guessCounter(){
        if(previousGuess != currentGuess) {
            this.counter++;
        }
        System.out.println("Number of guesses: " + this.counter);
    }

    public boolean equals(){
        if(secretNumber == currentGuess) {
            System.out.println("You win");

        }
        return secretNumber == currentGuess;

    }

    public boolean tooBig() {
        if(secretNumber < currentGuess){
            System.out.println("Too Big");

        }
        return secretNumber < currentGuess;
    }

    public boolean tooSmall() {

        if(secretNumber > currentGuess) {
            System.out.println("Too Small");

        }
        return secretNumber > currentGuess;
    }

    public boolean ifGuessEqualsLastGuess() {
        if (previousGuess == currentGuess) {
            return true;
        } else {
            return false;
        }
    }


    public void playGame() {
        Scanner scan = new Scanner(System.in);
        Prompt prompt = new Prompt();
        secretNumber = 50;
        while(currentGuess != secretNumber) {
            prompt.guess();
            currentGuess = scan.nextInt();
            tooBig();
            tooSmall();
            guessCounter();
            ifGuessEqualsLastGuess();
            equals();
        }
        System.out.println("It took you " + counter + " guesses");
    }
}
