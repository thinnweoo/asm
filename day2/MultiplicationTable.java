package assignments;
import java.util.Scanner;

public class MultiplicationTable {
	
	public void printMultiplicationTable(int n) {
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				System.out.print(i + "x" + j + "=" + i*j + " ");
				
			}
			System.out.println();
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		MultiplicationTable table = new MultiplicationTable();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		table.printMultiplicationTable(n);
		s.close();
		
	}
	

}
