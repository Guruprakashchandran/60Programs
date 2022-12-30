package ZohoSchool;

import java.util.Scanner;

public class RemainderAndQuatient {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Divided Number : ");
		int dividedNumber = scan.nextInt();
		System.out.print("Enter Division Number : ");
		int divisionNumber = scan.nextInt();
		//Quotient Value
		System.out.println("Quotient : "+ (dividedNumber/divisionNumber));
		//Remainder Value
		System.out.println("Remainder :"+ (dividedNumber%divisionNumber));
		scan.close();
	}
}
