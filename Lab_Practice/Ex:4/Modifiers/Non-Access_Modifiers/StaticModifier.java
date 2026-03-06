public class StaticModifier {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        System.out.println("Count: " + Counter.count);
    }
}
class Counter {
    static int count = 0;

    Counter() {
        count++;
    }
}