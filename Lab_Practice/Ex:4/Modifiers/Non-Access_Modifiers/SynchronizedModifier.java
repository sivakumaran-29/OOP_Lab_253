public class SynchronizedModifier {
    public static void main(String[] args) {
        SharedResource res = new SharedResource();
        new Thread(() -> res.printData(5)).start();
        new Thread(() -> res.printData(10)).start();
    }
}
class SharedResource {
    synchronized void printData(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try { Thread.sleep(100); } catch (Exception e) {}
        }
    }
}
