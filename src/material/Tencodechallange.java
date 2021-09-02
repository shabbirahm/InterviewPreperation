package material;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Tencodechallange {

	public static void main(String[] args) {
		/*
//	1- Write code to filter duplicate elements from an array and print as a list?
		ArrayList<String> list=new ArrayList<String>();
		
		//Form a list of numbers from 0-9
		for(int i=0;i<9;i++) {
			list.add(String.valueOf(i));
		}
		
//		Insert a new set of numbers from 0-5
		for(int i=0;i<5;i++) {
			list.add(String.valueOf(i));
		}
		System.out.println("Input list :"+list);
		System.out.println("Filtered duplicates :"+processList(list));
		
	}
	
	public static Set<String> processList(List<String> listContainingDuplicates){
		final Set<String> resultSet=new HashSet<String>();
		final Set<String> tempSet =new HashSet<String>();
		for(String yourInt:listContainingDuplicates) {
			if(!tempSet.add(yourInt)) {
				resultSet.add(yourInt);
			}
	}
return resultSet;
*/
//		 duplicate elements in given array
		/*
		int [] arr=new int[] {1,2,3,4,2,7,8,8,3};
		for (int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					System.out.println(arr[j]);
			}
		} */
//		2: Write code to sort the list of strings using Java collection?

		List<String> countries=new ArrayList<>();
		
		countries.add("Singapore");
		countries.add("India");
		countries.add("Usa");
		countries.add("UK");
		
		System.out.println("List of countries before sorting :");
		Iterator<String> it=countries.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Collections.sort(countries);
		
		System.out.println("List of countries after sorting :");
		
		it=countries.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
