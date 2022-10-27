package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Client Data:");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String clientBirthDate = sc.nextLine();
        System.out.print("Enter Order Data: ");
        String status = sc.nextLine();
        System.out.print("How many items to this order");
        Integer n = sc.nextInt();

        for (int i=1; i <= n; i++ ){
            System.out.print("Enter #"+i+"item data");
            System.out.print("Product Name: ");
            String productName = sc.next();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();

        }

        

    }
}