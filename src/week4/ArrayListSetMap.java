package week4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayListSetMap {

	public static void main(String[] args) {
		//1. An instance of an ArrayList of String called employeeNames
		List<String> employeeNames = new ArrayList<String>();
		
		//2. An instance of a HashSet of Integer called ids
		Set<Integer> ids = new HashSet<Integer>();
		
		//3. An instance of a HashMap of Integer, String called employeeMap
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();		
		
		//7. A StringBuilder called idsBuilder
		StringBuilder idsBuilder = new StringBuilder();
		
		//10. Another StringBuilder called namesBuilder
		StringBuilder namesBuilder = new StringBuilder();
		
		//4. Add at least five entries to the employeeNames
		employeeNames.add("Sandy");
		employeeNames.add("Randy");
		employeeNames.add("Hobbit");
		employeeNames.add("Sam");
		employeeNames.add("Pam");
		
		//4. Add the same number of entries to the ids as the employeeNames
		for(int i = 1; i <= employeeNames.size(); i++) {
			ids.add(i);
		}
		
		/* 5. Iterate over ids using an enhanced for loop. Inside the enhanced for loop 
		 * use employeeMap.put() to add a new entry to the map		
		 */
		int i = 0;
		for(Integer id : ids) {
			employeeMap.put(id, employeeNames.get(i));
			i++;
		}
		/*
		 * 6. Use another enhanced for loop to iterate over the employeeMap.keySet(), and use 
		 * the key for each current iteration to print to the console both the current key and 
		 * its associated value in the map
		 */
		Set<Integer> empIDs = employeeMap.keySet();
		System.out.println("6) The employeeMap with keys and their respective values are:");
		for(Integer empID : empIDs) {
			System.out.println("key: " + empID + ", value: " + employeeMap.get(empID));
		}
		
		//8. Iterate over the ids HashSet and append each id, followed by a dash “-“ to idsBuilder
		int idSize = ids.size();
		int count = 1;
		for(Integer id : ids)
		{
			idsBuilder.append(id);
			if(count < idSize) {
				idsBuilder.append("-");
			}
			count++;
		}
				
		//9. Print the result of idsBuilder.toString() to the console.
		System.out.println("\n9) The idsBuilder is: " + idsBuilder);
		
		/*11. Iterate over the employeeNames ArrayList and append each name, 
		 * followed by a space “ “ to the namesBuilder.		 */
		int nameSize = employeeNames.size();
		count = 1;
		for(String name : employeeNames) {
			namesBuilder.append(name);
			if(count < nameSize) {
				namesBuilder.append("-");
			}
			count++;
		}
		
		//12. Print the result of namesBuilder.toString() to the console.
		System.out.println("\n12) The namesBuilder is: " + namesBuilder);
			
	}// main()

}
