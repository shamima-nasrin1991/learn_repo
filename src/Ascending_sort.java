package array;

import java.util.Scanner;

public class Ascending_sort {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a[]=new int[6];
		int temp_a=0;
		System.out.println(" Take the array element");
		for(int i=0;i<a.length;i++) {
			a[i]=obj.nextInt();
		}
		System.out.println(" the orginal array is");
		for(int i= 0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}//Organize array ascending order
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp_a=a[i];
					a[i]=a[j];
					a[j]=temp_a;
				}
			}
		}
		System.out.println();
		System.out.println(" Array element is ascending order");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		// TODO Auto-generated method stub

	}

}
