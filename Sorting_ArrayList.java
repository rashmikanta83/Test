import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Sorting_ArrayList implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	public static void main(String args[]){
		List<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("aaa", "Manager", 200000));
		al.add(new Employee("aaa", "Manager", 5000));
		al.add(new Employee("vvv", "accountant", 340908));
		al.add(new Employee("sedf", "HouseKeeping", 3434));
		al.add(new Employee("dasjlj", "Delivery Manager", 234241232));
		al.add(new Employee("aaa", "HR", 56783));
		al.add(new Employee("gwew", "Test Engineer", 2323));
		for(Employee e : al){
			System.out.println(e);
		}
		Collections.sort(al,new Sorting_ArrayList());
		System.out.println("-----------------------------");
		for(Employee e : al){
			System.out.println(e);
		}
		
	}




}
