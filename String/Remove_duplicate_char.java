package String;

import java.util.Scanner;

public class Remove_duplicate_char {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();
	        
	        String result = "";  // new string without duplicates

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            boolean found = false;

	            // Check if this character already exists in result
	            for (int j = 0; j < result.length(); j++) {
	                if (result.charAt(j) == ch) {
	                    found = true;
	                    break;
	                }
	            }

	            // If not found, add to result
	            if (!found) {
	                result += ch;  // appending to string
	            }
	        }

	        System.out.println("After removing duplicates: " + result);
	        sc.close();
	    }

}
