package assignments;

import java.util.Scanner;

public class SumofNaturalNumbers {
	
	public int sumUsingForLoop(int n) {
		int sum = 0;
		for (int i=1; i<=n; i++ ) {
			sum += i;
		}
		return sum;
	}
	
	public int sumUsingWhileLoop(int n) {
		int sum = 0;
		int i = 1;
		while(i<=n) {
			sum += i;
			i++;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		SumofNaturalNumbers Sums = new SumofNaturalNumbers();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		
		int sumForLoop = Sums.sumUsingForLoop(n);
		int sumWhileLoop = Sums.sumUsingWhileLoop(n);
		
		System.out.println("sum using for loop = " + sumForLoop);
		System.out.println("sum using while loop = " + sumWhileLoop);
		
		s.close();
		
	}

}
