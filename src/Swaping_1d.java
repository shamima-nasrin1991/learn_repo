package array;

public class Swaping_1d {

	public static void main(String[] args) {
		int element[]= {11,12,13,14,15};
		int index=0;
		int index_dest=1;/* here 0, 1 is indexing point which one i do swap.if change index point
		it swap from here*/ 
		for(int i =0;i<element.length;i++) {
		int temp=element[index];//element[0]=11
		element[index]=element[1];//element[0]now 12
		element[1]=temp;
		}
		System.out.println(" After swaping element is:");
		for(int i=0;i<element.length;i++) {
			System.out.print(element[i]+" ");
		}
		
		// TODO Auto-generated method stub

	}

}
