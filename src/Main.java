public class Main {

    private static final String[] validNames = {"A1234G","C0318G"};
    private static final String[] invalidNames = {"M0318G","P0323A"};

    public static void main(String[] args) {
        ValidateClassName className = new ValidateClassName();

        for (String name : validNames) {
            System.out.println("Name is " + name + " is valid: " + className.validate(name));
        }

        for (String name : invalidNames) {
            System.out.println("Name is " + name + " is valid: " + className.validate(name));
        }
    }
}
