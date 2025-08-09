package String;

import java.util.Scanner;

public class MaxCharOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();

        int maxCount = 0;
        char maxChar = ' ';
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') continue;
            int count = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxChar = ch[i];
            }
        }

        System.out.println("Character '" + maxChar + "' occurred most with " + maxCount + " times.");
        sc.close();
    }
}
