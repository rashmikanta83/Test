import java.util.Comparator;


public class DesignationComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getDesignation().compareTo(o2.getDesignation());
	}

}
