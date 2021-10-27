/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.Random;

/**
 *
 * @author USER
 */
public class Runmain {
    public static void main(String[] args) {
        Random rd = new Random();
        Guns a = new Guns();
        Guns b = new Guns();
        
        a.setWeaponName("AK");
        a.setAmmoNumber(100);
        b.setWeaponName("CK");
        b.setAmmoNumber(100);
        while(a.getAmmoNumber()!=0 && b.getAmmoNumber()!=0){
            a.Shoot(rd.nextInt(10) + 1);
            b.Shoot(rd.nextInt(10)+1);
            if(a.getAmmoNumber()==0 && b.getAmmoNumber()==0){
                System.out.println("Nạp thêm  đạn.");
                a.Load(rd.nextInt(10)+1);
                b.Load(rd.nextInt(10)+1);
            }
            else{
                if(a.getAmmoNumber()==0){
                    System.out.println("Doan thua");
                    break;
                }
                if(b.getAmmoNumber()==0){
                    System.out.println("Diep thua");
                    break;
                }
            }
        }
    }
}
