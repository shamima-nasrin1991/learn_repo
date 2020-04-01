package array;

import java.util.*;

public class Count_Duplicate_ {
	static void findDuplicate(int[] arr) {
		Arrays.sort(arr);
		HashSet<Integer> dupe = new HashSet<Integer>();
		int previous = -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == previous) {
				dupe.add(arr[i]);
			}
			else {
				previous = arr[i];
			}
		}
		System.out.println(dupe.toString());
		System.out.println(dupe.size() + " duplicates");
	}
	static void removeDuplicates(int[] arr) {
		HashSet<Integer> out = new HashSet<Integer>();
		for(int i = 0; i < arr.length; i++) {
			out.add(arr[i]);
		}
		System.out.println(out.toString());
	}
	public static void main(String[] args) {
		int[] input = {1, 1, 1, 3, 4, 4};
		findDuplicate(input);
		System.out.println(" Without duplicate array is:");
		removeDuplicates(input);
	}

}
