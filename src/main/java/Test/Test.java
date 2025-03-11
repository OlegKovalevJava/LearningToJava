package Test;

public interface Test {
    void print(String text, int number);

    default String print2(String text) {
        return text + text;
    }
}
