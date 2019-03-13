package 实验1_2;

public class Client {

    static void test(String x) {
        try {
            TV tv=TVFactory.produceTV(x);
            tv.play();
        }
        catch (UnsupportedTVException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        test("hisense");
        test("haier");
        test("xxx");
    }

}
