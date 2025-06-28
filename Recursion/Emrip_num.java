package Recursion;

import java.util.Scanner;

public class Emrip_num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		System.out.println(isEmrip(n));
		sc.close();
	}

	public static boolean isEmrip(int n) {
		if (!isPrime(n, n / 2)) return false;

		int reversed = rev(n, 0);
		return (reversed != n && isPrime(reversed, reversed / 2)) ;
			
	}

	public static boolean isPrime(int n, int i) {
		if (i == 1) return true;
		if (n <= 1 || n % i == 0) return false;
		return isPrime(n, i - 1);
	}

	public static int rev(int n, int reversed) {
		if (n == 0) return reversed;
		reversed = reversed * 10 + n % 10;
		return rev(n / 10, reversed);
	}
}
