
package bai1;

import java.util.Scanner;
import java.lang.Math;
public class Runmain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int a,b,c;
        System.out.print("Nhap a = ");a = sc.nextInt();
        System.out.print("Nhap b =");b = sc.nextInt();
        System.out.print("Nhap c = ");c = sc.nextInt();
        
        System.out.println("Sô lớn nhất trong ba số là: " + max(a,b,c) );
    }
    public static int max(int a, int b,int c){
      return Math.max(a, Math.max(c, b));
  }
}
