import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Sorting_LinkedList_Test implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class Sorting_LinkedList {
	
	public static void main(String args[]){
		List<Employee> ll = new LinkedList<Employee>();
		ll.add(new Employee("aaa", "Manager", 200000));
		ll.add(new Employee("aaa", "Manager", 5000));
		ll.add(new Employee("vvv", "accountant", 340908));
		ll.add(new Employee("sedf", "HouseKeeping", 3434));
		ll.add(new Employee("dasjlj", "Delivery Manager", 234241232));
		ll.add(new Employee("aaa", "HR", 56783));
		ll.add(new Employee("gwew", "Test Engineer", 2323));
		for(Employee e : ll){
			System.out.println(e);
		}
		//Collections.sort(ll);
		Collections.sort(ll,new Sorting_LinkedList_Test());
		System.out.println("-----------------------------");
		for(Employee e : ll){
			System.out.println(e);
		}
		
	}

}
