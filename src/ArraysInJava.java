package array;

public class ArraysInJava {

	public static void main(String[] args) {
		int[]a= {12,21,0,5,7};
		int[]b=a;//coping array 'a' to array'b'
		//printing elements of array'b'
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		a[2]=56;//changing value of 3rd element of array 'a'
		System.out.println(b[2]);//value of 3rd element of array 'b'also changes
		b[4]=100;//changing value of 5th element of array 'b'
		System.out.println(a[4]);//value of 5th element of array 'a'also changes
		// TODO Auto-generated method stub

	}

}
