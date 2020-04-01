package array;

import java.util.Scanner;

public class Sub_Martix {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a[][]=new int [3][3];//1st array
		int b[][]=new int [3][3];//2nd array
		int sub[][]=new int[3][3];//array that hold the difference
		System.out.println(" Take elements from user 'a' array: ");
		for(int i=0;i<a.length;i++) {
		   for(int j=0;j<a.length;j++) {
				a[i][j]=obj.nextInt();
				}
			}
		System.out.println(" The'a' array is ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		System.out.println(" Take elements from user 'b' array: ");
		for(int i=0;i<b.length;i++) {
		   for(int j=0;j<b.length;j++) {
				b[i][j]=obj.nextInt();
				}
			}
		System.out.println(" The'b' array is ");
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++) { 
				System.out.print(" "+b[i][j]);
			}
			System.out.println();
		}
		// below loop for make subtraction
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				sub[i][j]=a[i][j]-b[i][j];
			}
		}
		System.out.println(" After subtraction the martix is:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(" "+sub[i][j]);
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
