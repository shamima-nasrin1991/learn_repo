package array;

import java.util.Scanner;

//Make a list of 5 student where student name,student id and college name using array.

public class Student_information {
	 static String college;

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String name[]=new String[6];
		String id[]=new String[6];
		System.out.println("Enter the student college name");
		college=obj.nextLine();
		for(int i=0;i<6;i++) {
        System.out.println(" Enter student name");
		name[i]=obj.nextLine();
		System.out.println(" Enter student id ");
		id[i]=obj.nextLine();
	     }
		for(int i=0;i<6;i++) {
			System.out.println("Didplay student info:"+name[i]+" "+id[i]+" "+college);
		}
		
		// TODO Auto-generated method stub

	}

}
