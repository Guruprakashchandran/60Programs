package ZohoSchool;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int row=0,value = 0;
		for(int i = 1;input>value;++i) {
			
			value += i;
			row = i;
		}
		int column = (row * 2) - 1;
		value = column/2;
		for(int index = 1,i = 0;i < row;++i) {
			for(int j = 0;j < column && index <= input;++j) {
				
				if(i+j == value || j-i == value) {
					
					System.out.print(index+"\t");
					index++;
				}
				else if(i+j > value && j-i < value && (j+i)%2 == (value%2)) {
					
					System.out.print(index+"\t");
					index++;
				}
				else {
					
					System.out.print("\t");
				}
			}
			System.out.println("\n\n");
		}
		scan.close();
	}
}
