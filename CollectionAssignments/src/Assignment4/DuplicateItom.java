package Assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateItom {
	
	public static void main(String[] args) {
		
		List<String> Item=new ArrayList<String>();
		
		      Item.add("Mobile");
		      Item.add("Laptop");
		      Item.add("Bag");
		      Item.add("Laptop");
		      Item.add("Mobile");
			
		Set<String> RemoveDuplicate=new HashSet<>(Item);
		
		System.out.println("After Removing Duplicate: "+ RemoveDuplicate);
		
		List<String> sort=new ArrayList<String>(RemoveDuplicate);
		
		Collections.sort(sort, Collections.reverseOrder());
		
		System.out.println("In descendingorder: "+ sort);
		
	}

}
