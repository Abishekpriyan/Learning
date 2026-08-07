public class AAAOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Arithmetic Operations a = 10 and  b = 20");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println();

        System.out.println("Logical Operations a = 10 and b = 20");
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));
        System.out.println();

        System.out.println("Bitwise Operations a = 10 and b = 20");
        /*
        * a = 10 = 0000 1010
        * b = 20 = 0001 0100
        * 
        * 0000 1010
        * & 0001 0100
        * -----------
        * 0000 0000 → 0
         * 
         * 0000 1010
         * | 0001 0100
         * -----------
         * 0001 1110 → 30
         * 
         * 0000 1010
         * ^ 0001 0100
         * -----------
         * 0001 1110 → 30
         * 
         * NOT (~a)
         * ~10 = -(10 + 1) = -11
         *
         * NOT (~b)
         * ~20 = -(20 + 1) = -21
         * 
         * Left Shift (a << 2)
         * 0000 1010 → 0010 1000 → 40 (10 × 2² = 40)
         * 
         * Right Shift (a >> 1)
         * 0000 1010 → 0000 0101 → 5 (10 ÷ 2¹ = 5)
         * 
         * Left Shift (b << 1)
         * 0001 0100 → 0010 1000 → 40 (20 × 2¹ = 40)
         * 
         * Right Shift (b >> 2)
         * 0001 0100 → 0000 0101 → 5 (20 ÷ 2² = 5)
         * 
         */
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));
        System.out.println("a >>> 1 = " + (a >>> 1));
        System.out.println();

        System.out.println("Assignment Operations a = 10 and b = 20");
        System.out.println("a += b = " + (a += b));
        System.out.println("a -= b = " + (a -= b));
        System.out.println("a *= b = " + (a *= b));
        System.out.println("a /= b = " + (a /= b));
        System.out.println("a %= b = " + (a %= b));
        System.out.println("a &= b = " + (a &= b));
        System.out.println("a |= b = " + (a |= b));
        System.out.println("a ^= b = " + (a ^= b));
        System.out.println("a <<= 1 = " + (a <<= 1));
        System.out.println("a >>= 1 = " + (a >>= 1));
        System.out.println("a >>>= 1 = " + (a >>>= 1));
        System.out.println();

        System.out.println("Unary Operations a = 10");
        System.out.println("+a = " + (+a));
        System.out.println("-a = " + (-a));
        System.out.println("a++ = " + (a++));
        System.out.println("a-- = " + (a--));
        System.out.println("++a = " + (++a));
        System.out.println("--a = " + (--a));
        System.out.println();

    }
}