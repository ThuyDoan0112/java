/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.time.Clock;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Array {
    private int [] a;
    private int n;
    Scanner sc = new Scanner(System.in);
    public void inputData(){
        do{
            System.out.print("Nhap n = ");
            n = sc.nextInt();
            if(n<=0)
                System.out.println("Nhap lai n (n>0");
        }while(n<=0);
        a = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("a["+(i+1)+"]= ");
            a[i] = sc.nextInt();      
        }
    }
    public void show(){
        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }          
    }
    public int sum(){
        int sum=0;
        for(int i=0;i<n;i++)
            sum += a[i];
        return sum;
    }
    public void filter(boolean flag){
        if(flag==true){
            for(int i=0;i<n;i++)
                if(a[i]%2==0)
                    System.out.print(a[i] + " ");
        }else{
            for(int i=0;i<n;i++)
                if(a[i]%2!=0)
                    System.out.print(a[i] + " ");
        }
    }

    public Array(int[] a, int n) {
        this.a = a;
        this.n = n;
    }

    public Array() {}

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
}
