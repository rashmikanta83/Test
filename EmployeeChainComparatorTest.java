import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class EmployeeChainComparatorTest {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("aaa", "Manager", 200000));
		list.add(new Employee("aaa", "Manager", 5000));
		list.add(new Employee("vvv", "accountant", 340908));
		list.add(new Employee("sedf", "HouseKeeping", 3434));
		list.add(new Employee("dasjlj", "Delivery Manager", 234241232));
		list.add(new Employee("aaa", "HR", 56783));
		list.add(new Employee("gwew", "Test Engineer", 2323));
		
		System.out.println("-------Before Sorting---");
		for(Employee e : list){
			System.out.println(e);
		}
		System.out.println("----------------------------------");
		System.out.println("-------After sorting------");
		Collections.sort(list, new EmployeeChainComparator(
				new NameComparator(),new DesignationComparator(),new SalaryComparator()));
		for(Employee e : list){
			System.out.println(e);
		}
	}

}
