
package bai1;

import java.util.Scanner;


public class Runmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Nhap chuoi:");
        str = sc.nextLine();
        int count =0, sum =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                sum+=(str.charAt(i)-'0');
                count++;
            }
        }
        int s=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                if(sum%(str.charAt(i)-'0')==0){
                    s*=(str.charAt(i)-'0');
                }
            }
        }
        System.out.println("So ki tu so:" + count);
        System.out.println("Tich: " + s);
    }
}
