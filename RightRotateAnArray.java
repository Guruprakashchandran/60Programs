package ZohoSchool;

import java.util.Scanner;

public class RightRotateAnArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int a[] = new int[length];
		for(int i = 0;i<length;++i) {
			
			a[i] = scan.nextInt();
		}
		int pos = a[length-1];
		for(int i = 0;i<length;++i) {
			
			int temp = a[i];
			a[i] = pos;
			pos = temp;
			System.out.print(a[i]+" ");
		}
		scan.close();
	}
}
