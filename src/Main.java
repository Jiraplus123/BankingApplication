import java.util.Random;
import java.util.Scanner;
import IdentifyMethod.*;

public class Main {
    public static void main(String[] args) {
        int option = 0, number;
        String name;
        double balance;
        Bank bank = new Bank("KBANK");
        Account account;
        Scanner scan = new Scanner(System.in);

        number = generateAccountNumber();
        System.out.println(number);
        while (option != 6){
            System.out.println("Main Menu");
            System.out.println("1. Display All Account ");
            System.out.println("2. Open New Account ");
            System.out.println("3. Close Existing Account ");
            System.out.println("4. Deposit ");
            System.out.println("5. Withdraw ");
            System.out.println("6. Exit ");
            System.out.println("");

            System.out.print("Enter your choice: ");
            option = scan.nextInt();

            switch (option){
                case 1:
                    System.out.println("Hello");
                    break;
                case 2:
                    System.out.println("Open New Account");
                    name = scan.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    balance = scan.nextDouble();
                    number = generateAccountNumber();
                    account = new Account(1,"Plub",10000.00);
                    bank.openAccount(account);
                    break;
                case 3:
                    System.out.println("Close Existing Account");
                    break;
                case 4:
                    System.out.println("Deposit");
                    break;
                case 5:
                    System.out.println("Withdraw");
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }



        }


    }

    public static int generateAccountNumber(){
        Random rand = new Random();
        int number = 100000 + rand.nextInt(900000);
        return number;
    }
}