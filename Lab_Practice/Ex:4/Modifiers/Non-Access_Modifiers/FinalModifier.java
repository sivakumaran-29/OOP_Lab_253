public class FinalModifier {
    public static void main(String[] args) {
        Constants c = new Constants();
        System.out.println(c.SPEED_OF_LIGHT);
    }
}
class Constants {
    final double SPEED_OF_LIGHT = 299792458;
}
