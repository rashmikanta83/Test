import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class EmployeeChainComparator implements Comparator<Employee>{
	private List<Comparator<Employee>> listCompare;

	@SafeVarargs
	public EmployeeChainComparator(Comparator<Employee>... comparators){
		listCompare = Arrays.asList(comparators);
	}
	
	@Override
	public int compare(Employee o1, Employee o2) {
		for(Comparator<Employee> compare : listCompare){
			int result = compare.compare(o2, o1);
			if (result != 0) {
                return result;
            }
		}
		return 0;
	}

}
