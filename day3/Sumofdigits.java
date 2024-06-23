package day3;

public class Sumofdigits {
	
	public int sumofdigits(int n) {
		if(n==0) return 0;
		return n%10 + sumofdigits(n/10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sumofdigits digit = new Sumofdigits();
		
		int result = digit.sumofdigits(123);
		System.out.println(result);
		

	}

}
