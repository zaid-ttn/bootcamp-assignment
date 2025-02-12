import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Employees{
    String name;
    Long salary;
    String city;

    Employees(String name,Long salary,String city){
        this.name=name;
        this.salary=salary;
        this.city=city;
    }
    public String toString(){
        return "Full Name: " +name+"Salary:  "+salary+"city: "+city;
    }
    public String getFirst(){
        String[]str=name.split(" ");
        return str[0];
    }
}
public class OptionalCase {

    public static void main(String[] args) {
        List<Employees>ls=new ArrayList<>();
        ls.add(new Employees("Anurag yadav",23000L,"firozabad"));
        ls.add(new Employees("Krishna yadav",84000L,"Delhi"));
        ls.add(new Employees("Zaid Khan",43000L,"Delhi"));
        ls.add(new Employees("Zaid Khan",67000L,"Delhi"));


        Set<String> conditions= ls.stream()
                .filter(emp -> emp.salary > 5000 && emp.city.equals("Delhi")).map(emp -> emp.getFirst())
                .collect(Collectors.toSet());

        for (String val : conditions) {
            System.out.println(val);
        }

    }
}
