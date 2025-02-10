public class Employee{
		private String firstName;

		private String lastName;

		private int age;

		private String designation;

		public Employee(){
			this.firstName = "";
        		this.lastName = "";
        		this.age = 0;
       			this.designation = "";
		}
		public Employee(String firstName,String lastName,int age,String designation){
                        this.firstName = firstName;
                        this.lastName = lastName;
                        this.age = age;
                        this.designation = designation;
                }

		public void setFirst(String firstName) {
       			 this.firstName = firstName;
    		}

    		public void setLast(String lastName) {
        		this.lastName = lastName;
    		}

    		public void setAge(int age) {
        		this.age = age;
    		}
    		public void setDesignation(String designation) {
        		this.designation = designation;
    		}

		public  String toString(){
			return "Name - "+firstName+" "+lastName+" "+" Age -"+age+" "+"Designation -"+" "+designation;
		}

		public static void main(String[]args){
			Employee emp=new Employee();
			System.out.println(emp);

			Employee emp2=new Employee("Zaid","Khan",22,"Student");
			System.out.println(emp2);

		//	emp2.toString();
		}

}
