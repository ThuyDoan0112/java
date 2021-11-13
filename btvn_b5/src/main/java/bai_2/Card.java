/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Card {
    private String idCard;
    private String nameCard;
    private DateTime a;
    List<Product> x = new ArrayList<>();
    private int n;
    
    public void inputCard(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID card: ");
        idCard = sc.nextLine();
        System.out.println("Enter Card's name: ");
        nameCard = sc.nextLine();
        a = new DateTime();
        a.inputDate();
        System.out.println("Enter n = ");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            Product y = new Product();
            y.inputProduct();
            x.add(y);
        }
    }
    public void outputCard(){
        System.out.println("ID card: " + idCard);
        System.out.println("Card's name: " + nameCard);
        System.out.printf("Ngay nhap: ");
        a.outputDate();
        System.out.printf("%-10s %-30s %-10s %-12s %-15s \n", "ID product", "PRoduct's name", "Amount", "Price", "Into money");
        for(int i=0;i<x.size();i++){
           x.get(i).outputProduct();
        }
    }
}
