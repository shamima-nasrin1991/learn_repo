package array;

import java.util.Scanner;

//Take 7th number from keyboard and find max value.


public class Max_number {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int num[]=new int[7];
		System.out.println("Input the number from keyboard");
		//print the all array elements
		for(int i=0;i<num.length;i++) {
			num[i]=obj.nextInt();
		}
		//finding the max value
		int max=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
		}
		System.out.println("The max value is :"+max);
		// TODO Auto-generated method stub

	}

}
