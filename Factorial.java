package day3;

public class Factorial {
	
	public int factorial(int n) {
		if(n==1) return 1;
		else return n * factorial(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factorial fact = new Factorial();
		
		int result = fact.factorial(5);
		
		System.out.println(result);

	}

}
