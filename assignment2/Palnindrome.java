package week1.assignment2;

public class Palnindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int input = 100;
		        int output = 0;
		        for (int i = input; i > 0; i /= 10) {
		            int rem = i % 10; // Get last digit
		            output = (output * 10) + rem; // Build reversed number
		        }

		        if (input == output) {
		            System.out.println(input + " is a Palindrome.");
		        } else {
		            System.out.println(input + " is not a Palindrome.");
		        }
		    }
	}

