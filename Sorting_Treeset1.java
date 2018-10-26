import java.util.Comparator;
import java.util.TreeSet;


public class Sorting_Treeset1 {

	public static void main(String[] args) {
		TreeSet<Employee> t= new TreeSet<Employee>(new TreesetCompare());
		t.add(new Employee("hdj", "Manager", 181671));
		t.add(new Employee("safasf", "Manager", 34434));
		t.add(new Employee("wewe", "Analyst", 1222));
		t.add(new Employee("sadff", "Developer", 565463));
		t.add(new Employee("cbf", "D-Manager", 78565));
		t.add(new Employee("hweewdj", "TL", 232323));
		/*TreeSet<String> t =new TreeSet<String>();
		t.add("sdsds");
		t.add("qwqwq");
		t.add("asasdasd");
		t.add("ereewq");
		t.add("szddd");*/
		for(Employee e : t){
			System.out.println(e);
		}
	}

}
class TreesetCompare  implements Comparator<Employee>{
	
	
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

		
	
}

