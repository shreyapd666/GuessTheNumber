import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

import static java.sql.DriverManager.println;

class Game{
    int numOfGuess=1;
    int userNum;
    int comNum;
    boolean gameOver = true;
   Game()
    {
        Random random = new Random();
        comNum= random.nextInt(100);
    }
    public int getUserInput()
    {
        System.out.print("Guess your number: ");
        Scanner num = new Scanner(System.in);
        return userNum = num.nextInt();
    }
    public void setNoOfGuesses()
    {
        numOfGuess++;
    }
    public void getNoOfGuesses()
    {
        System.out.println("correct! You guessed this number in " + numOfGuess + " Times.");
    }
    public void isCorrectNumber()
    {
        while (gameOver)
        {
            if (userNum > comNum) {
                System.out.println(" You guessed high");
                setNoOfGuesses();
                getUserInput();
            } else if (userNum < comNum) {
                System.out.println("You guessed low");
                setNoOfGuesses();
                getUserInput();
            } else {
                System.out.println("Congregates You Win");
                getNoOfGuesses();
                gameOver = false;
            }
        }
    }
}
public class GuessTheNumber {
    public static void main(String[] args) {
        Game player = new Game();
        player.getUserInput();
        player.isCorrectNumber();
    }
}