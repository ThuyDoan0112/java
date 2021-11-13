
package bai_1;

import bai_1.SanPham;
import java.util.Scanner;


public class DieuHoa extends SanPham{
    private float congSuat;
    private float giaBan;
  
    public void nhap(){
      Scanner sc = new Scanner(System.in);
      super.nhap();
        System.out.println("Cong suat: ");
        congSuat = sc.nextFloat();
        System.out.println("Gia ban: ");
        giaBan = sc.nextFloat();
  } 
    public void xuat(){
        super.xuat();
        System.out.printf("%-10.2f %-15.5f \n",congSuat, giaBan);
    }
    
    public float getGiaBan() {
        return giaBan;
    }
    
}
