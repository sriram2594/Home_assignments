package week1.assignment3;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int range = 8, a = 0, b = 1, sum;

	        System.out.print(a+ "," +b);

	        for (sum = a + b; sum <= range; sum = a + b) {
	            System.out.print(", " + sum);
	            a = b;
	            b = sum;
	        }
	    }
	}
