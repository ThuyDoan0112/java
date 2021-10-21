
package bai3;

import java.util.Scanner;

public class Runmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi:");
        String s = sc.nextLine();
        int n = s.length();
        int dem = 0, tong = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)>= '0'&& s.charAt(i)<='9'){
                dem++;
                tong+=Character.getNumericValue(s.charAt(i));
            }      
        }
        if(dem!=0){
            System.out.println("True");
            System.out.println("Trung bình cộng các chữ số trong chuỗi: "+ (float)tong/dem);
        }
        else
            System.out.println("False");
    }
    
}
