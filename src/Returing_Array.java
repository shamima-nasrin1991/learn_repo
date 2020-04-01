package array;

public class Returing_Array {
	public static String [] ReturnArray() {
		String[] aArray= {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};
		return aArray;
	}

	public static void main(String[] args) {
		
		String[] aMake=ReturnArray();
		for(int i=0;i<aMake.length;i++) {
			System.out.println("Printing all the values of an array==>"+aMake[i]);
	
		}
		// TODO Auto-generated method stub

	}

}
