 
package bai5;


public class Runmain {
    public static boolean isPrime(int n){
        for (int i = 2; i*i<=n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(long n) {
        if (n == (int) n) {
            for (int i = 2; i*i<=n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPrime(float n) {
        if (n == (int) n) {
            for (int i = 2; i*i<=n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPrime(double n) {
        if (n == (int) n) {
            for (int i = 2; i*i<=n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("------ Integer ------");
        System.out.println(isPrime(4));
        System.out.println(isPrime(2));
        System.out.println("------ Long ------");
        System.out.println(isPrime(19l));
        System.out.println(isPrime(14l));
        System.out.println("------Float ------");
        System.out.println(isPrime(4.754238f));
        System.out.println(isPrime(3.0f));
        System.out.println("----- Double ------- ");
        System.out.println(isPrime(5.5482375));
        System.out.println(isPrime(2.3546));
    }
}
