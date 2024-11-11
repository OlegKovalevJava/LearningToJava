import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        System.out.println(stringList.isEmpty());
        stringList.add("strings");
        System.out.println(stringList.isEmpty());
    }

    public static List<Integer> go(List<Integer> integerList) {
        return integerList;
    }


}
