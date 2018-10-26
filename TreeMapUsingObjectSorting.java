import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapUsingObjectSorting {
 
 public static void main(String a[]){
  TreeMap<Worker,String> map = new TreeMap<Worker, String>(new MyNameComp());
  map.put(new Worker("david",5000), "david");
  map.put(new Worker("joy",2000), "joy");
  map.put(new Worker("abel",7000), "abel");
  map.put(new Worker("ruby",9000), "ruby");
  
  for (Map.Entry<Worker, String> entry : map.entrySet()) {
   System.out.println("KEY : "+ entry.getKey() +" \t VALUE : "+entry.getValue());
  }
 }
}
 class Worker{
	    
	    private String name;
	    private int salary;
	    
	    public Worker(String name, int salary){
	        this.name = name;
	        this.salary = salary;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public int getSalary() {
	        return salary;
	    }
	    public void setSalary(int salary) {
	        this.salary = salary;
	    }
	    /* Called by entry.getKey() 
	       Overriding toString() method from super class Object
	       Since key is Object we are return our own key value
	    */
	    public String toString(){
	     //return super.toString();
	     return "("+this.name+":"+this.salary+")";
	    }
	}
 
  class MyNameComp implements Comparator<Worker>{

	 @Override
	 public int compare(Worker obj1, Worker obj2) {
		 return obj1.getName().compareTo(obj2.getName());
	    } 
	}