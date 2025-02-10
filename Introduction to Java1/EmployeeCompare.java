import java.util.*;
class Employee implements Comparable<Employee>{
	double age;
	double salary;
	String name;

	Employee(String name,double age,double salary){
		this.age=age;
		this.salary=salary;
		this.name=name;
	}

	public String toString(){
		return "Age - "+age+ ",name -"+name+" "+",salary"+" "+salary+" \n";
	}
	public int compareTo(Employee other){
		int compareName=this.name.compareTo(other.name);
		return compareName;
	}
}


class CompareSalary implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2){
		return Double.compare(e1.salary,e2.salary);
	}
}
public class EmployeeCompare{
	public static void main(String[]args){
		Employee emp1=new Employee("Zaid",24,25000);
		Employee emp2=new Employee("Ayan",28,15000);
		Employee emp3=new Employee("Krishna",26,35000);
		Employee emp4=new Employee("Tarun",26,35600);

		List<Employee> ls=new ArrayList<>();
		ls.add(emp1);
		ls.add(emp2);
		ls.add(emp3);
		ls.add(emp4);

		System.out.println(ls);

		Collections.sort(ls);

		System.out.println("After Sorting based on age");
		System.out.println(ls);

		Collections.sort(ls, new CompareSalary());

        	System.out.println("After sorting by salary");
        	System.out.println(ls);
	}
}
