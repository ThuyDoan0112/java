
package bai_2;
import java.security.PublicKey;
import java.util.Scanner;
import java.lang.Math;
public class Runmain {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int chon;
        int n;
        System.out.print("Nhap n = ");
          n = sc.nextInt();
        int[]a;
          a = new int[n+1];
        do{
            System.out.println("1.Nhập mảng");
            System.out.println("2.Xuất mảng");
            System.out.println("3.Thêm một phần tử vào vị trí k bất kì");
            System.out.println("4.Xóa một phần tử tại vị trí k bất kì");
            System.out.println("5.Hiển thị mảng đảo ngược");
            System.out.println("6.Hiện thị phần tử a[1] và chia hết cho các số a[1]");
            System.out.println("7.Xuất ra tổng các số nguyên tố trong mảng");
            System.out.println("8.Thoát");
            System.out.print("Mời bạn chọn: ");
            chon = sc.nextInt();
            switch(chon){
                case 1:
                    nhapMang(a, n);
                    break;
                case 2:
                    System.out.println("Xuất mảng:");
                    xuatMang(a, n);
                    break;
                case 3:
                    System.out.println("Mảng sau khi chèn: ");
                    them(a, n);
                    n++;
                    break;
                case 4:
                    System.out.println("Mảng sau khi xóa");
                    xoa(a, n);
                    n--;
                    break;
                case 5:
                    System.out.println("Mảng đảo ngươc: ");
                    dao(a, n);
                    break;
                case 6:
                    a1(a, n);
                    break;
                case 7:
                    System.out.println("Tổng các số nguyên tố: " + sumNT(a, n));
                    break;
                case 8:   
                    System.out.println("Bạn đã thoat chương trình");
                    return ;
                default:
                     System.out.println("mới bạn nhập lại");
            }
        }while(true);
    }
    public static void nhapMang(int []a, int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập mảng:");
        for(int i=0;i<n;i++){
            System.out.println("Nhập phần tử thứ " + (i+1) +"]");
            a[i] = sc.nextInt();
        }
}
    public static void xuatMang(int []a, int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
    public static void them(int []a, int n ) {
        Scanner sc = new Scanner(System.in);
        int k,x;
        do{
            System.out.print("Nhập vị trí cần chèn: ");
            k = sc.nextInt();
        }while(k<=0 && k > n);
        System.out.print("Nhạp số cần chèn: ");
        x = sc.nextInt();
        for(int i=n;i>=k;i--){
            a[i] = a[i-1];
        }
        n++;
        a[k-1] = x;
        xuatMang(a, n);
    }
    public static void xoa(int []a, int n) {
        Scanner sc = new Scanner(System.in);
        int k;
        do{
            System.out.print("Nhập vị trí cần xóa: ");
            k = sc.nextInt();
        }while(k<=0 && k > n);
        for(int i=k-1;i<n;i++){
            a[i]=a[i+1];
        }
        n--;
        xuatMang(a, n);
    }
    public static void dao(int [] a, int n) {
        for(int i=n-1;i>=0;i--){
            System.out.print(a[i] + " ");
        }
            System.out.println("");
    }
    public static void a1(int []a,int n) {
        System.out.println("Phần tử a[1]= " + a[1]);
        System.out.println("Các số trong mảng chia hết cho a[1] : ");
        for(int i=0;i<n;i++){
            if(a[i]%a[1]==0)
                System.out.println(a[i] + " ");
        }
        System.out.println("");
    }
    public static boolean kt(int n) {
        if(n<2) 
            return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static int sumNT(int [] a, int n) {
        int sum=0;
        for(int i=0;i<n;i++){
            if(kt(a[i]) == true)
                sum+=a[i];
        }
        return sum;
    }
}
