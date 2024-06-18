package ATM;
import java.io.*;
import java.util.Scanner;
public class Account 
{
    private int balance;
    private int password;
    private static final String FILE_PATH = "account.txt";

    public Account()
    {
        loadAccountDetails();
    }

    public int getBalance() 
    {
        return balance;
    }

    public void setBalance(int balance) 
    {
        this.balance = balance;
        saveAccountDetails();
    }

    public int getPassword() 
    {
        return password;
    }

    public void setPassword(int password) 
    {
        this.password = password;
        saveAccountDetails();
    }

    private void loadAccountDetails() 
    {
        try (Scanner scanner = new Scanner(new File(FILE_PATH))) 
        {    
            password = scanner.nextInt();
            balance = scanner.nextInt();
        } 
        catch (FileNotFoundException e) 
        {
            password = 2266;
            balance = 0;
            saveAccountDetails();
        }
    }

    private void saveAccountDetails() 
    {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_PATH))) 
        {
            writer.println(password);
            writer.println(balance);
        } 
        catch (IOException e) 
        {
            System.out.println("Error in saving account details");
        }
    }
}

