package Assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
	
  List<Integer> Numbers = new ArrayList<Integer>();
		Numbers.add(7);
		Numbers.add(2);
		Numbers.add(3);
		Numbers.add(3);
		Numbers.add(1);
	
	   Collections.sort(Numbers);	
		
	Set<Integer> Removeduplicate=new HashSet<>(Numbers);
	
	System.out.println("After Removing duplicates: " +Removeduplicate);
	
	

	}

}
