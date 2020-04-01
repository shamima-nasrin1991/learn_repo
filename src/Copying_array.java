package array;

public class Copying_array {

	public static void main(String[] args) {
		char[] copyFrom= {'d','e','c','a','f','f','e','i','n','e','t','e','d'};
		char[] copyTo=new char[7];
		System.arraycopy(copyFrom,2,copyTo,0,7);
		System.out.println( new String(copyTo));
		// TODO Auto-generated method stub

	}

}
