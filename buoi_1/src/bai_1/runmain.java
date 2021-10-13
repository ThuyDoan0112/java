package buoi_1;
public class Bai_1 {
    public static void main(String[] args) {
       int n=4, m=6;
       for(int i=1;i<=n;i++){
           for(int j=1;j<=m;j++){
               if(i == 1 || i == n || j == 1 || j == m)
                   System.out.print("*");
               else 
                   System.out.print(" ");
           }
           System.out.print("\n");
       }
    }
    
}
