import java.util.Optional;

class OptionalTest{
    public Optional<String>getName(String name){
        return Optional.ofNullable(name);
    }
}
public class OptionalUse {
    public static void main(String[] args) {
        OptionalTest opt=new OptionalTest();

        String s="zaid";
        Optional<String>str=opt.getName(s);

        str.ifPresent(val-> System.out.println(val));
    }
}
