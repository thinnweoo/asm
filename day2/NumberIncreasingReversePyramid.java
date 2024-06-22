package assignments;

public class NumberIncreasingReversePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 4;
		for(int i=0; i<=n; i++) {
			
			for(int j=1; j<=n-i; j++) {
				System.out.print(j + " ");
				
			}

//			System.out.println(n);
//			System.out.println(i);
			System.out.println();
		}
	}

}
