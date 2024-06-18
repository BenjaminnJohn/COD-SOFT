package ATM;
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            int password;
            boolean authenticated = false;
            Account account = new Account();
            ATMoperations atmService = new ATMoperations(account);

            while (!authenticated) 
            {
                System.out.println("Enter your 4 digit secret code:");
                password = sc.nextInt();
                if (password == account.getPassword()) 
                {
                    authenticated = true;
                    atmService.display();
                } 
                else 
                {
                    System.out.println("Wrong password");
                }
            }
        }
    }
}

