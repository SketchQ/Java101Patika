package Pratikler;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);

        int retry = 3;
        double balance = 15000.00;
        int select;

        while (retry > 0) {
            System.out.print("Please enter your username : ");
            userName = input.nextLine();
            System.out.print("Please enter your password : ");
            password = input.nextLine();
            if (userName.equals("SketchQ") && password.equals("92aF35Gdr10e8")) {
                do {
                    System.out.println("Access Granted...\nWelcome to bank of America " + userName
                            + "\nPlease select the action you would like to do: \n1 - Deposit\n2 - Withdraw\n3 - Check Balance\n4 - Log Off...");
                    select = input.nextInt();
                    switch (select) {
                    case 1:
                        System.out.print("Amount of Cash : ");
                        int cash = input.nextInt();
                        balance += cash;
                        break;
                    case 2:
                        System.out.print("Amount of Cash you would like to withdraw : ");
                        int withdraw = input.nextInt();
                        if (withdraw > balance) {
                            System.out.println("Not enough Money...");
                        } else {
                            balance -= withdraw;
                        }
                        break;
                    case 3:
                        System.out.println("Your Balance is : " + balance + " TRY");
                        break;
                    case 4:
                        System.out.println("Logging Off...");
                        break;
                    default:
                        System.out.println("Please enter a valid input.");
                    }
                } while (select != 4);
                break;
            } else {
                --retry;
                if (retry == 0) {
                    System.out.println("Your account has been blocked, please contact to customer service...");
                    input.close();
                } else {
                    System.out.println("Wrong password or username, Please Try again...\nRemaining retries : " + retry);
                }

            }
        }

    }

}
