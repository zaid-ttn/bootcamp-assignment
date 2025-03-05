package Ques2;
record Student(int id,String name,String standard){
    Student{
        if(id==0){
            throw new IllegalArgumentException("Id can not be zero");
        }
    }
}
public class ThrowInRecords {
    public static void main(String[] args) {
        Student s1 = new Student(1, "ayaan", "12th");
        Student s2 = new Student(2, "krishna", "10th");
        Student s3 = new Student(2, "krishna", "10th");
        Student s4 = new Student(0, "zaid", "7th");

    }
}


