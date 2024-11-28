import java.util.List;

public class ArrGet {

    //String oneString = "one";
    //String twoString = "two";
    //String threeString = "three";

    public List<String> sortStrings (List<String> stringList) {

        List<String> sorted = (List<String>) stringList.stream().sorted();
    }

}
