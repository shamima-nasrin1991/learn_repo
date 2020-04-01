package array;
//write a program to find the duplicate values of an array(two) of integer values

import java.util.Scanner;

public class Duplicate_array {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int digit[]=new int[5];
		int num[]=new int[5];
		System.out.println(" Take the value of digit");
		for(int i=0;i<digit.length;i++) {
			digit[i]=obj.nextInt();
		}
		System.out.println(" Take the value of num");
		for(int i=0;i<num.length;i++) {
			num[i]=obj.nextInt();
		}
		for(int i=0;i<digit.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(digit[i]==num[j]&& i!=j) {
				
					System.out.println(" The duplicate value is:"+digit[i]);
					
				}
			}
		}
		
		// TODO Auto-generated method stub

	}

}
