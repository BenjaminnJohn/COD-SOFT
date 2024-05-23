package CODSOFT;
import java.util.Scanner;
public class RandomNumberRecursion{
    public static void main(String[] args)
    {
        startGame();
    }
    public static void startGame() 
    {
        int low = 1;
        int high = 100;
        int random = (int)((Math.random()*100) + 1);
        System.out.println("You have 5 chances, All the best!");
        randomNumberGame(low, high, random, 5);
    }
    public static void randomNumberGame(int low,int high,int random,int turns) {
        try(Scanner scanner=new Scanner(System.in)) 
        {
            {
                int guess;
                int response;
                if (turns>0 && turns<=5) 
                {
                    System.out.printf("Enter your guess between the range [%d and %d]:%n", low, high);
                    guess = scanner.nextInt();
                    if (guess<random) 
                    {
                        System.out.println("Your guess is too low");
                        low = guess+1;
                        turns--;
                        randomNumberGame(low, high, random, turns);
                    } 
                    else if (guess > random) 
                    {
                        System.out.println("Your guess is too high");
                        high = guess-1;
                        turns--;
                        randomNumberGame(low, high, random, turns);
                    }
                    else 
                    {
                        System.out.println("Your guess is correct!\nDo you want to play again? 1.Yes (any other number).NO");
                        response = scanner.nextInt();
                        if (response == 1)
                        startGame();
                        else 
                        System.out.println("Thank you for playing with us");
                        return;
                    }
                } 
                else 
                {
                    System.out.println("Your chances are over\nDo you want to play again? 1.Yes (any other number).NO");
                    response = scanner.nextInt();
                    if (response == 1) 
                    startGame();
                    else 
                    System.out.println("Thank you for playing with us");
                    return;
                }
            }
        }
    }
}