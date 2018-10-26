import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;


public class Sorting_Hashmap_Values {
	public static void main(String args[]){
		HashMap<String,Employee> h = new HashMap<String, Employee>();
		h.put("111", new Employee("qwqwqw", "Manager", 45454));
		h.put("222", new Employee("erwrewr", "Analyst", 12121));
		h.put("3333", new Employee("hjghjh", "Analyst", 454545));
		h.put("444", new Employee("qweqe", "Manager", 67676));
		h.put("555", new Employee("asasa", "Manager", 78787));
		h.put("6666", new Employee("add", "Analyst", 2323));
		h.put("7777", new Employee("qwewrweqwqw", "TL", 11212));
		Collection<Employee> c= h.values();
		List<Employee> l = new ArrayList<Employee>(c); 
		for(Employee e : l){
			System.out.println(e);
		}
		Collections.sort(l, new Sorting_Hashmap_Values_ByName());
		System.out.println("---------------------------");
		for(Employee e : l){
			System.out.println(e);
		}
	}
}
class Sorting_Hashmap_Values_ByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
}

