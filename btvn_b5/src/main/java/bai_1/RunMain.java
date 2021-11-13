
package bai_1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap n: ");
        n = sc.nextInt();
        ArrayList<DieuHoa> dieuhoa = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            DieuHoa a = new DieuHoa();
            a.nhap();
            dieuhoa.add(a);
        }
        int dem=0;
        System.out.println("danh sach san pham do hang Electrolux san xuat: ");
        for(int i=0;i<dieuhoa.size();i++){
            if(dieuhoa.get(i).hangSX.compareTo("Electrolux")==0){
                    dieuhoa.get(i).xuat();
                    dem++;
            }
        }
        if(dem ==0){
            System.out.println("khong ton tai");
        }
        float min = dieuhoa.get(0).getGiaBan();
        for(int i=0;i<dieuhoa.size();i++){
            if(dieuhoa.get(i).getGiaBan()< min)
                min = dieuhoa.get(i).getGiaBan();
        }
        System.out.println("San phaam co gia ban nho nhat: ");
        for(int i=0;i<dieuhoa.size();i++){
            if(dieuhoa.get(i).getGiaBan() == min)
                 dieuhoa.get(i).xuat();
        }
    }
}
