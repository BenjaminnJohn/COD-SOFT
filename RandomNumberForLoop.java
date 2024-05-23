package CODSOFT;
import java.util.Scanner;
public class RandomNumberForLoop {
    public static void main(String arr[])
    {
        StartGame();
    }
    public static void StartGame()
    {   
        System.out.println("Your game Starts now\nYou got 5 cahnces! All the best");
        int low=1;
        int high=100;
        PlayRandomNumber(low,high);
    }
    public static void PlayRandomNumber(int low,int high)
    {
        int i;
        int response;
        int guess;
        int random = (int)((Math.random()*100)+1);
        try (Scanner scanner = new Scanner(System.in)) {
            for(i=0;i<5;i++)
            {
                System.out.println("Guess no. "+ (i+1) + " Enter a guess between the range [" + low + "to " + high + " ]");
                guess = scanner.nextInt();
                if(guess<random)
                {
                    System.out.println("Your guess is too low");
                    low=guess+1;
                }
                else if(guess>random && guess>100)
                {
                    System.out.println("Your guess is too high");
                    high=100;
                }
                else if(guess>random && guess<=100)
                {
                    System.out.println("Your guess is too high");
                    high=guess-1;
                }
                else
                {
                System.out.println("Your guess is correct\ndo you want to play again \n1.yes \n(any other number).no");
                response = scanner.nextInt();
                if(response==1)
                StartGame();
                else
                System.out.println("Thank you for playing with us");
                return; 
                }
            }
            if(i==5)
            {
                System.out.println("Your chances have got over\ndo you want to play again \n1.yes \n(any other number).no");
                response = scanner.nextInt();
                if(response==1)
                StartGame();
                else
                System.out.println("Thank you for playing with us");
                return;    
            }
        }
    }
}