package Test;

class TestImpl implements Test {
    @Override
    public void print(String text, int number) {

    }

    @Override
    public String print2(String text) {
        return Test.super.print2(text);
    }

}
