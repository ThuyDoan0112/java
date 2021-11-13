
package bai_2;

import java.util.Scanner;


public class Product {
    private String idProduct;
    private String nameProduct;
    private int amount;
    private float price;
    
    public void inputProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID product: ");
        idProduct = sc.nextLine();
        System.out.println("Product's name: ");
        nameProduct = sc.nextLine();
        System.out.println("Amount: ");
        amount = sc.nextInt();
        System.out.println("Price: ");
        price = sc.nextFloat();
    }
    public void outputProduct(){
        System.out.printf("%-10s %-30s %-15d %-10.2f %-15.2f \n", idProduct, nameProduct, amount, price, (amount*price));
}
    
}
