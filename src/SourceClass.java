import java.util.ArrayList;
import java.util.List;

public class SourceClass {
    public static void main(String[] args) {
        FirstClass f=new FirstClass();
        List<String> s=new ArrayList<>();
        s.add("pavan");
        s.add("dharun");
        s.add("kanagaraj");
        s.add("datta");
        s.add("ambrish");

        f.printString(s);
        /*
        hello 
         */

    }
}
