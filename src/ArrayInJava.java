package array;

public class ArrayInJava {
	static void methodone(double d[]) {
		d[2]=25.32;
		d[5]=45.89;
		
	}

	public static void main(String[] args) {
		double d[]=new double[8];
		 d[2]=10.25;
		 d[5]=15.35;
		 methodone(d);
		 System.out.println(d[2]);//output 25.32
		 System.out.println(d[5]);//output 45.89
		// TODO Auto-generated method stub

	}

}
