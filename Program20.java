package ZohoSchool;

import java.util.Scanner;

public class Program20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter x :");
		int x = scan.nextInt();
		x = x++ * 2 + 3 * --x;
		System.out.println("X Value : "+x);
		scan.close();
	}
}
