package array;

public class PassByArray {
	static void display(int x[]) {
		System.out.println(x[0]);//print 10
		x[0]=100;
	}

	public static void main(String[] args) {
		int y[]= {10,20,30};
		System.out.println(y[0]);//print 10
		display(y);
		System.out.println(y[0]);//print 100
		// TODO Auto-generated method stub

	}

}
