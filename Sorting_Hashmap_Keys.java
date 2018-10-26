import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;


public class Sorting_Hashmap_Keys {
	public static void main(String args[]){
		HashMap<Employee,String> h = new HashMap<Employee, String>();
		h.put(new Employee("qwqwqw", "Manager", 45454),"1111");
		h.put( new Employee("erwrewr", "Analyst", 45454),"2222");
		h.put( new Employee("hjghjh", "Analyst", 454545),"3333");
		h.put( new Employee("qweqe", "Manager", 67676),"44444");
		h.put( new Employee("asasa", "Manager", 78787),"5555");
		h.put(new Employee("add", "Analyst", 2323),"666666");
		h.put(new Employee("qwewrweqwqw", "TL", 11212),"7777");
		
		
		Set<Employee> c= h.keySet();
		List<Employee> l = new ArrayList<Employee>(c); 
		for(Employee e : l){
			System.out.println(e);
		}
		//Collections.sort(l, new Sorting_Hashmap_Keys_ByName());
		Collections.sort(l, new Sorting_Hashmap_Keys_ByDesignation());
		System.out.println("---------------------------");
		for(Employee e : l){
			System.out.println(e);
		}
	}
}

class Sorting_Hashmap_Keys_ByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
}
class Sorting_Hashmap_Keys_ByDesignation implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getDesignation().compareTo(o2.getDesignation());
	}
}
