package Loops;

import java.util.Scanner;

public class Alternative_Automorphic_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int count = 1;

        for (int i = start; i <= end; i++) {
            int sqr = i * i;
            int num = i;
            boolean flag = true;

            while (num > 0) {
                if ((num % 10) != (sqr % 10)) {
                    flag = false;
                    break;
                }
                num /= 10;
                sqr /= 10;
            }

            if (flag) {
                if (count % 2 != 0) 
                    System.out.print(i + " ");
                
                count++;
            }
        }
        sc.close();
    }
}
