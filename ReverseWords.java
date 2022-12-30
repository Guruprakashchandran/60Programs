package ZohoSchool;

import java.util.Scanner;

public class ReverseWords {

	static String str = "";
	public static void recursive(int position,String s) {
		
		if(position == 0) {
			
			str += s.charAt(position);
			for(int i = str.length()-1;i>=0;--i) {
				
				System.out.print(str.charAt(i));
			}
			return;
		}
		else if(s.charAt(position) == ' ') {
			
//			str += s.charAt(position);
			for(int i = str.length()-1;i>=0;--i) {
				
				System.out.print(str.charAt(i));
			}
			System.out.print(" ");
			str = "";
			recursive(position-1,s);
		}
		else {
			
			str += s.charAt(position);
			recursive(position-1,s);
		}
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		recursive(s1.length()-1,s1);
		scan.close();
	}
}
