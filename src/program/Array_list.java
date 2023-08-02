package program;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class Array_list {

	public static void main(String[] args) {
		
		//list
		
	/*	@SuppressWarnings("rawtypes")
		ArrayList i= new ArrayList();
		i.add(10);
		i.add('q');
		i.add("class");
		i.add(10);
		i.add('q');
		i.add("class");
		
		@SuppressWarnings("rawtypes")
		Iterator it= i.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
		
		//hashset
		@SuppressWarnings({ "rawtypes", "unused" })
		
		HashSet h= new HashSet();
		h.add("qwer");
		h.add(123);
		h.add('q');
		h.add("qwer");
		h.add(123);
		h.add('q');

		 Iterator it1=h.iterator();
		 
		 while(it1.hasNext())
		 {
			 System.out.println(it1.next());
		 }
		
		
		
		
	}

}
