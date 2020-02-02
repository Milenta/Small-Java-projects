package mae;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortList {

	public static void main(String[] args) {
		
		List <Character> characters = List.of('A', 'C', 'H', 'B', 'A');
		
		// unique  - set
		// hash
		// tree
		// LinkedHash
		
		// sort by order without double chars
		Set <Character> setList  = new TreeSet<> (characters);
		System.out.println("TreeSet : " + setList);
		
		// sort by order of creation of chars without double chars
		Set <Character> linkedHash = new LinkedHashSet<> (characters);
		System.out.println("LinkedHashSet : " + linkedHash);
		
		// chars will not always be in order
		Set <Character> hash = new HashSet<> (characters);
		System.out.println("HashSet : " + hash);
		
	}
	
}
