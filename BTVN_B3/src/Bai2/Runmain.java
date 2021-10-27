/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author USER
 */
public class Runmain {
    public static void main(String[] args) {
        Array arr1 = new Array();
        Array arr2 = new Array();
        
        System.out.print("Nhap mang thu nhat: ");
        arr1.inputData();
        System.out.print("Nhap mang thu nhat: ");
        arr2.inputData();
        if((arr1.sum()/arr1.getN())>(arr2.sum()/arr2.getN()))
            arr1.show();
        else if((arr1.sum()/arr1.getN())<(arr2.sum()/arr2.getN()))
            arr2.show();
        else
            System.out.println("Bye");
    }
}
