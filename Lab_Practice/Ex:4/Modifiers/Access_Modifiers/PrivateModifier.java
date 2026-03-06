public class PrivateModifier {
    public static void main(String[] args) {
        SecretVault vault = new SecretVault();
        vault.revealVault("1234"); 
    }
}
class SecretVault {
    private String pincode = "1234";

    private void hiddenMethod() {
        System.out.println("Inside the vault!");
    }

    public void revealVault(String input) {
        if (input.equals(pincode)) {
            hiddenMethod();
        } else {
            System.out.println("Access Denied!");
        }
    }
}
