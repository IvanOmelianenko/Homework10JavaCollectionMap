import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProgrammingLanguage {
    public static void main(String[] args) {
        List<String> progLan = new ArrayList<>();
        progLan.add("Java");
        progLan.add("Python");
        progLan.add("Perl");
        progLan.add("C++");
        progLan.add("Java");
        progLan.add("C++");
        progLan.add("C#");
        Set<String> uniqProgLan = new HashSet<>(progLan);
        System.out.println(uniqProgLan);
    }
}
