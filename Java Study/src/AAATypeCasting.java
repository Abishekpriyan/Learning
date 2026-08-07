public class AAATypeCasting {
    public static void main(String[] args) {
        // Implicit (Widening) conversion
        int num = 100;
        double bigNum = num;
        System.out.println("Widening: " + bigNum);

        // Explicit (Narrowing) conversion
        double price = 199.99;
        int roundedPrice = (int) price;
        System.out.println("Narrowing: " + roundedPrice);

        // char to int (implicit)
        char ch = 'A';
        int asciiValue = ch;
        System.out.println("ASCII value of A: " + asciiValue);

        // int to char (explicit)
        int num2 = 66;
        char ch2 = (char) num2;
        System.out.println("Character for 66: " + ch2);
    }
}