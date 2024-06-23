package day3;

public class Fibonacci {
	
	public int fibonacci(int n) {
		if(n<=1) return n;
		return fibonacci(n-2) + fibonacci(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fibonacci fibo = new Fibonacci();
		int result = fibo.fibonacci(6);
		System.out.println(result);

	}

}
