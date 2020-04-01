package array;
//write a program 2d array sorting ascending order
//bubble sort 
import java.util.Scanner;

public class Array_multi {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int arr[][]=new int[3][3];
		int temp=0;
		System.out.println(" Take element from user");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=obj.nextInt();
			}
		}
		System.out.println(" 2d array is:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		//2d array sorting acceding order
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i].length-j;k++) {
					if(arr[i][k]>arr[i][j]) {
					temp=arr[i][k];
					arr[i][k]=arr[i][j];
					arr[i][j]=temp;
				}
			}
		}
		}
		System.out.println(" Ascending array is ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
