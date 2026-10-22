
import java.util.Scanner;

public class Bank {
    public void Mainmenu() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Bank!");
        System.out.println("Opening Balance: 10000");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        int balance = 10000;
        do
        {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Your balance is: " + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = scanner.nextInt();
                    if ( depositAmount > 0) {
                        balance = balance + depositAmount;
                        System.out.println("Deposit Successful.");
                        System.out.println("Updated Balance: " + balance);
                    }
                    else { System.out.println("Transaction Failed: Amount Should be Greater than 0.");}
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = scanner.nextInt();
                    if ( withdrawAmount > 0){
                        if (withdrawAmount < balance) {
                            balance = balance - withdrawAmount;
                            System.out.println("Withdrawn Successful.");
                            System.out.println("Updated Balance: " + balance);
                        }
                        else {System.out.println("Transaction Failed: Insufficient Balance.");}
                    }
                    else {System.out.println("Transaction Failed: Amount should be greater than 0");}
                    break;
                case 4:
                    System.out.println("Exiting...");scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (true);

    }
    public static void main(String [] args) {
        Bank bank = new Bank();
        bank.Mainmenu();

    }
}
