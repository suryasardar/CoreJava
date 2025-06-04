public class DataTypesExample {
    public static void main(String[] args) {
        // 1. byte (1 byte, range: -128 to 127)
        byte byteVar = 100;

        // 2. short (2 bytes, range: -32,768 to 32,767)
        short shortVar = 10000;

        // 3. int (4 bytes, range: -2^31 to 2^31-1)
        int intVar = 100000;

        // 4. long (8 bytes, range: -2^63 to 2^63-1)
        long longVar = 10000000000L;

        // 5. float (4 bytes, single-precision)
        float floatVar = 10.5f;

        // 6. double (8 bytes, double-precision)
        double doubleVar = 20.99;

        // 7. char (2 bytes, stores a single character)
        char charVar = 'A';

        // 8. boolean (1 bit, true or false)
        boolean booleanVar = true;

        // Print all values
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + booleanVar);
    }
}
