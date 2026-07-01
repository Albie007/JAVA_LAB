public class DataTypeDemo {
    public static void main(String[] args) {
        // Storing values of different data types
        byte byteVal = 10;
        short shortVal = 1000;
        int intVal = 100;
        long longVal = 100000L;
        float floatVal = 25.5f;
        double doubleVal = 123.456;
        char charVal = 'A';
        boolean booleanVal = true;

        // Displaying their values exactly as in Expected Output
        System.out.println("Integer value : " + intVal);
        System.out.println("Long value    : " + longVal);
        System.out.println("Float value   : " + floatVal);
        System.out.println("Double value  : " + doubleVal);
        System.out.println("Character    : " + charVal);
        System.out.println("Boolean      : " + booleanVal);

        // Also demonstrate memory ranges or size (can print or keep as comments)
        /*
        Memory Ranges and Sizes:
        - byte: 1 byte (8 bits), -128 to 127
        - short: 2 bytes (16 bits), -32,768 to 32,767
        - int: 4 bytes (32 bits), -2,147,483,648 to 2,147,483,647
        - long: 8 bytes (64 bits), -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        - float: 4 bytes (32 bits), 1.4E-45 to 3.4028235E38
        - double: 8 bytes (64 bits), 4.9E-324 to 1.7976931348623157E308
        - char: 2 bytes (16 bits), 0 to 65,535 (Unicode)
        - boolean: 1 bit (virtual machine dependent size), true or false
        */
    }
}
