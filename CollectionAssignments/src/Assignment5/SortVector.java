package Assignment5;

import java.util.Collections;
import java.util.Vector;

public class SortVector {
	
	public static void main(String[] args) {
		
		Vector<String> vitem=new Vector<>();
		   vitem.add("waterbottle");
		   vitem.add("table");
		   vitem.add("laptop");
		   vitem.add("mobile");
		   vitem.add("headphone");
		   
		 Collections.sort(vitem);
		 
		System.out.println("Sorted vector: "+ vitem);
		   
		   
	}

}
