package ZohoSchool;

import java.util.Scanner;

public class Program17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the X : ");
		int x = scan.nextInt();
		System.out.print("Enter the Y : ");
		int y = scan.nextInt();
		scan.close();
		double pi = 3.14159265;
		double arrX = pi * x * x;
		double arrY = pi * y * y;
		System.out.print("Area of Space : "+(arrX - arrY));
		scan.close();
	}
}
