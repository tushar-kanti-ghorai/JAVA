package Recursion;
import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));
        sc.close();
    }

    public static boolean isArmstrong(int n) {
        int count = countDigits(n);
        int sum = calcArmstrongSum(n, count ,0);
        return sum == n;
    }

   
    public static int countDigits(int n) {
        if (n == 0) return 0;
        return 1 + countDigits(n / 10);
    }

    public static int power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }

    public static int calcArmstrongSum(int n, int count,int sum) {
        if (n == 0) return sum;
        sum+=power(n%10, count);
        return calcArmstrongSum(n / 10, count,sum);
    }
}
