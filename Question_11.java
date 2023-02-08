public class Question_11 {
    public static String addBinary(String a, String b) {
        long n = Long.parseLong(a);
        long n1 = Long.parseLong(b);
        int base = 2;
        long pov = 1;
        long c = 0;
        long rv = 0;
        while (n > 0 || n1 > 0 || c > 0) {
            long d1 = n % 10;
            long d2 = n1 % 10;
            n /= 10;
            n1 /= 10;
            long d = d1 + d2 + c;
            c = d / base;
            d = d % base;
            rv += d * pov;
            pov *= 10;
        }
        return String.valueOf(rv);
    }

    public static void main(String[] args) {
        System.out.println(addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101","110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }
}
