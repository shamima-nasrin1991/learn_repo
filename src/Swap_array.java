package array;

import java.util.Scanner;

public class Swap_array {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a[]=new int[4];
		int b[]=new int[4];
		int temp[]=new int[4];
		System.out.println(" Take a array element from user");
		for(int i=0;i<a.length;i++) {
			a[i]=obj.nextInt();
		}
		System.out.println(" Take b array element from user");
		for(int i=0;i<b.length;i++) {
			b[i]=obj.nextInt();
		}
		System.out.println(" Before swaping 'a' array is:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println(" Before swaping 'b' array is:");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		for(int i=0;i<a.length;i++) {
			temp[i]=a[i];
			a[i]=b[i];
			b[i]=temp[i];
		}
		System.out.println();
		System.out.println(" After swaping 'a' array is:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println(" After swaping 'b' array is:");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		// TODO Auto-generated method stub

	}

}
