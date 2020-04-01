package array;



public class Count_duplicate {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,5,1,2,9,8,5,5};
		int count=0;;int temp=0;
      for (int i = 0; i <array.length; i++) {
		   //temp=array[i];
		    for (int j =i; j <array.length; j++) {
		        if (array[i]== array[j]) {
		        	array[i]=temp;
		        	temp=array[j];
		        	
		            count++;
		           // System.out.println(" Number of duplicate element:"+count);
		            
		        }
		    }
		   
		}
      System.out.println(" The number of duplicate is:"+count);
		
		// TODO Auto-generated method stub

	}

}
