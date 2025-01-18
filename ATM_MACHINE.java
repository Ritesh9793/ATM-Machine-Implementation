package ATM_Machine;

import java.util.Scanner;

class atmMachine{

    float balance;
    int PIN = 5674;

    public void checkpin(){
        System.out.println("Enter your PIN: " );
        Scanner sc = new Scanner(System.in);
        int enteredPIN = sc.nextInt();

        if(enteredPIN == PIN){
            menu();
        } else {
            System.out.println("Enter a Valid PIN.");
            menu();
        }
    }

    public void menu(){
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check A/C Balance.");
        System.out.println("2. Withdraw money.");
        System.out.println("3. Deposite Money.");
        System.out.println("4. EXIT.");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1) {
            checkBalance();
        }
        else if(opt == 2) {
            withdrawMoney();
        }
        else if(opt == 3) {
            depositeMoney();
        }
        else if(opt == 4) {
            return;
        }
        else {
            System.out.println("Enter a valid choice.");
        }
    }

    public void checkBalance(){
        System.out.println("Balance " + balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.println("Enter amount to withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount<balance){
            System.out.println("Insufficient Funds.");
        } else {
            balance = balance - amount;
            System.out.println("Money withdrawn Successfully.");
        }
        menu();
    }

    public void depositeMoney(){
        System.out.println("Enter the Amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance = balance + amount;
        System.out.println("Money Deposited Successful.");
        menu();
    }

}

public class ATM_MACHINE {
    public static void main(String[] args) {

        atmMachine obj = new atmMachine();
        obj.checkpin();
    }
}

