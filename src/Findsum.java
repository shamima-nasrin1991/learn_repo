package array;

import java.util.Scanner;

public class Findsum {
	static int find_sum(int value[]) {
		int sum=0;
		for(int i=0;i<10;i++) {
			sum+=value[i];
		}
		return sum;
		
	}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int num[]=new int[10];//instantiate the array
		//array elements are 
		for(int i=0;i<10;i++) {
			System.out.println("Enter the number "+i+":-");
			num[i]=obj.nextInt();
			
		}
		int total=find_sum(num);//return type method calling
		System.out.println("Sum of the total number:"+total);
		// TODO Auto-generated method stub

	}

}
