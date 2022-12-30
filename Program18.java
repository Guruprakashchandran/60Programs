package ZohoSchool;

import java.util.Scanner;

public class Program18 {

	public static void  main(String[] args) throws Exception{
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter A : ");
		int a = scan.nextInt();
		System.out.print("Enter B : ");
		int b = scan.nextInt();
		
		System.out.println("1) ++a - b-- => ans :"+(++a - b--));
		System.out.println("2) a % b++ => ans :"+ (a % b++));
		System.out.println("3) a *= b + 5 => ans : "+(a *= b + 5));
		System.out.println("4) x = 69 >>> 2 => ans :"+(69 >>> 2));
		scan.close();
	}
}
