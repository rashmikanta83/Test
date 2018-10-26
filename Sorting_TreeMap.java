
import java.util.*;


public class Sorting_TreeMap {
	public static void main(String args[]){
		TreeMap<String, Employee> t = new TreeMap<String, Employee>();
		t.put("111", new Employee("qwqwqw", "Manager", 45454));
		t.put("222", new Employee("erwrewr", "Analyst", 12121));
		t.put("3333", new Employee("hjghjh", "Analyst", 454545));
		List<Employee> l= new ArrayList<Employee>(t.values());
		Collections.sort(l, new ValueNameSort());
		
		for(Employee e: l){
			System.out.println(e);
		}

	}
}

class ValueNameSort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}

/*class TreeMap_Valuesccc implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}
*/