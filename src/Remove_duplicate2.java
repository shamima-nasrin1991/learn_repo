package array;

import java.util.Scanner;

public class Remove_duplicate2 {

	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
		int a[]=new int[7];
		int length=a.length;
		int temp_a[]=new int[a.length];
		//int tem_a[]=a;
		int j=0;
		System.out.println(" Take array element from keyboard");
		for(int i=0;i<a.length;i++) {
			a[i]=obj.nextInt();
		}
		for(int i=0;i<length-1;i++) {
			if(a[i]!=a[i+1]) {
			temp_a[j++]=a[i];
			}
		}
		temp_a[j++]=a[length-1];
		for(int k=0;k<j;k++) {
		
			System.out.println(" with out duplicate element:"+a[k]+" ");
		}
		// TODO Auto-generated method stub

	}

}
