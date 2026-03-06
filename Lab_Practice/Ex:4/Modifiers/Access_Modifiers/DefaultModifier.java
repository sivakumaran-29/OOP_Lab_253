public class DefaultModifier {
    public static void main(String[] args) {
        Neighbor n = new Neighbor();
        System.out.println(n.neighborhoodWatch);
    }
}
class Neighbor {
    String neighborhoodWatch = "I can see you because we live in the same package!";
}