package Ques3;

record Student(int id,String name,String standard){

}

public class UseEquals {
    public static void main(String[] args) {
        Student s1 = new Student(1, "ayaan", "12th");
        Student s2 = new Student(2, "krishna", "10th");
        Student s3 = new Student(2, "krishna", "10th");
        Student s4 = new Student(3, "zaid", "7th");
        System.out.println("Equals Method Check -"+s2.equals(s3));
        System.out.println("HashCode Check -"+(s2 == s3));
    }



}
