
package Bai_4;


public class RunMain {
    public static void main(String[] args) {
         Sum<Integer> x = new Sum<Integer>(2,3);
         System.out.println("Tong hai so: " + (x.getSoA()+x.getSoB()));
         Sum<Long> y = new Sum<Long>(10l, 3l);
         System.out.println("Tong hai so: " + (y.getSoA()+y.getSoB()));
         Sum<Float> z = new Sum<Float>(1.2f,3.4f);
         System.out.println("Tong hai so: " + (z.getSoA()+z.getSoB()));
         Sum<Double> p = new Sum<Double>(22.4,3.5);
         System.out.println("Tong hai so: " + (p.getSoA()+p.getSoB()));        
    }
}
