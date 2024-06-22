package assignments;
// import java.util.Scanner;

public class SquareHollowPattern {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner s = new Scanner(System.in);
//		System.out.println("enter your size");
//		int size = s.nextInt();
		int size = 5;
		for(int i=0; i<=size; i++) {
			for(int j=0; j<size; j++) {		//j<=size
				if(i == 0 || i == size || j == 0 || j == size-1) {		//j==size
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		// s.close();

	}

}
