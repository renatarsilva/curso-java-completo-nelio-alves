package modulo08Estoque.application;

import modulo08Estoque.entities.Product;

import javax.xml.namespace.QName;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("price: ");
        product.price = sc.nextDouble();

        System.out.println("Quantity in Stock: ");
        product.quantity = sc.nextInt();

        System.out.println("Product data: " +product);


        sc.close();

    }
}
