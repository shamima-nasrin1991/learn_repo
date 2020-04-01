package array;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_duplicate {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int element[]=new int[6];
		int j=0;
		System.out.println(" Take the element from keyboard");
		for(int i=0;i<element.length;i++) {
			element[i]=obj.nextInt();
		}
		System.out.println(" Orginal array is:");
		for(int i=0;i<element.length;i++) {
			System.out.print(element[i]+" ");
		}
		int count=element.length;
				for(int i=0;i<count-1;i++) {
			for( j=i+1;j<count;j++) {
	           if(element[i]==element[j]) {
	        	   element[j]=element[count-1];
	        	  count--;
				}
			}}
				System.out.println(" ");
		System.out.println( " New array without duplicate");
                for(int i=0;i<count;i++) {
				System.out.print(element[i]+" ");
					
						
					}
			// TODO Auto-generated method stub
			}
	}
	


