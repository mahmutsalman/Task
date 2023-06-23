package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //Person person1 =  new Person("Ahmet","Gold",true,true);

       // System.out.println(Calculator.calculateNetPayableAmount(person1,100,false));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter user name: ");
            String name = scanner.nextLine();

            System.out.print("Enter card type (gold/silver): ");
            String cardType = scanner.nextLine();

            System.out.print("Is user an affiliate (true/false): ");
            boolean isAffiliate = scanner.nextBoolean();

            System.out.print("Is user a customer for over 2 years (true/false): ");
            boolean isOver2YearsCustomer = scanner.nextBoolean();

            System.out.print("Enter bill amount: ");
            double billAmount = scanner.nextDouble();

            System.out.print("Does the purchase include a phone (true/false): ");
            boolean hasPhone = scanner.nextBoolean();

            Person person = new Person(name, cardType, isAffiliate, isOver2YearsCustomer);
            double netPayableAmount = Calculator.calculateNetPayableAmount(person,billAmount,hasPhone);

            System.out.println("Net Payable Amount: $" + netPayableAmount);

            // Consume the remaining newline character from the previous input
            scanner.nextLine();

            System.out.print("Do you want to enter new details? (yes/no): ");
            String continueChoice = scanner.nextLine();

            if (!continueChoice.equalsIgnoreCase("yes")) {
                break;
            }
        }

        scanner.close();

    }
}
