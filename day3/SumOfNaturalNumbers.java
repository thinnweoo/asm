package day3;

public class SumOfNaturalNumbers {
	
	public int sumofnaturalnums(int n) {
		if (n==1) return 1;
		else return n + sumofnaturalnums(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SumOfNaturalNumbers sum = new SumOfNaturalNumbers();
		
		int result = sum.sumofnaturalnums(5);
		System.out.println(result);

	}

}
