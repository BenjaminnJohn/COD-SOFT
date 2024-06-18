package ATM;
import java.util.Scanner;
public class ATMoperations 
{
    private int input;
    private int deposit;
    private int withdraw;
    private boolean password = true;
    private Account account;
    private Scanner sc = new Scanner(System.in);
    public ATMoperations(Account account) 
    {
        this.account = account;
    }
    public void display() 
    {
        while (password) 
        {
            System.out.println("What do you want to do today?");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Check Balance");
            System.out.println("4. Change password");
            System.out.println("5. Cancel Transaction");
            input = sc.nextInt();

            switch (input) 
            {
                case 1:
                    Deposit();
                    break;
                case 2:
                    Withdraw();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    changePassword();
                    break;
                case 5:
                    CancelTransaction();
                    break;
                default:
                    System.out.println("Enter a valid input");
                    break;
            }
        }
    }
    private void Deposit() 
    {
        System.out.println("Enter the amount you want to deposit:");
        deposit = sc.nextInt();
        if (deposit > 0) {
            account.setBalance(account.getBalance() + deposit);
            System.out.println(deposit + " has been credited to your bank account");
        } 
        else 
        {
            System.out.println("Invalid number\nDeposit a valid amount next time");
        }
    }
    private void Withdraw() 
    {
        System.out.println("Enter the amount you want to withdraw:");
        withdraw = sc.nextInt();
        if(withdraw <= account.getBalance() && withdraw > 0) 
        {
            account.setBalance(account.getBalance()-withdraw);
            System.out.println(withdraw + " has been withdrawn");
        } 
        else if(withdraw > account.getBalance()) 
        {
            System.out.println("Insufficient balance");
        } 
        else 
        {
            System.out.println("You've entered an invalid amount");
        }
    }
    private void checkBalance() 
    {
        System.out.println("You have " + account.getBalance() + " left in your bank account");
    }
    private void changePassword() 
    {
        System.out.println("Enter your current password:");
        int currentPassword = sc.nextInt();
        if(currentPassword == account.getPassword()) 
        {
            System.out.println("Enter your new password:");
            int newPassword = sc.nextInt();
            account.setPassword(newPassword);
            System.out.println("Password has been changed successfully");
        } 
        else 
        {
            System.out.println("You've entered a wrong password");
        }
    }
    private void CancelTransaction() 
    {
        password = false;
        System.out.println("Thank you for using our ATM");
    }
}