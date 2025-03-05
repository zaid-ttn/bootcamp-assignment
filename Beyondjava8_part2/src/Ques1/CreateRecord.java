package Ques1;
record Student(int id,String name,String standard){

        }
public class CreateRecord {
    public static void main(String[] args) {
        Student s1=new Student(1,"ayaan","12th");
        Student s2=new Student(2,"krishna","10th");
        Student s3=new Student(2,"krishna","10th");
        Student s4=new Student(0,"zaid","7th");
        System.out.println(s2.equals(s3));
        System.out.println(s2==s3);
        System.out.println(s1.toString());
        System.out.println(s4.toString());
    }
}
