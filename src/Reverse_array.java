package array;

import java.util.Scanner;

public class Reverse_array {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int earray[]=new int[7];
		System.out.println("Take the earray element from keyboard to ascending order");
		for(int i=0;i<earray.length;i++) {
			earray[i]=obj.nextInt();
		}
		System.out.println(" Before reverse array is:");
		for(int i=0;i<earray.length;i++) {
			System.out.print(earray[i]+" ");
		}
		System.out.println(" ");
		System.out.println(" After reverse array is:");
		for(int i=earray.length-1;i>=0;i--) {
			System.out.print(earray[i]+" ");
		}
		// TODO Auto-generated method stub
	
	}

}
