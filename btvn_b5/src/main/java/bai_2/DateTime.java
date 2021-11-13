
package bai_2;

import java.util.Scanner;


public class DateTime {
    private int d;
    private int m;
    private int y;
    
    public void inputDate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day: ");
        d = sc.nextInt();
        System.out.println("Enter month: ");
        m = sc.nextInt();
        System.out.println("Enter year: ");
        y = sc.nextInt();
    }
    public  void outputDate(){
        System.out.println(d+"/"+m+"/"+y);
    }
}
