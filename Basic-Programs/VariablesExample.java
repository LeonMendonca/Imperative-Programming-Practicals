// Write a program and declare a few variables of type int, string, float, etc

class VariablesExample {
    public static void main(String[] args){
        int intNum = 4;                 // Integer
        float floatNum = 83.2f;         // Float
        double doubleNum = 43.3;        // Double
        long longNum = 45l;             // Long
        String name = "John";           // String
        char A = 'A';                   // Character
        System.out.println(
            String.format("Integer: %s\nFloat: %s\nDouble: %s\nLong: %s\nString: %s\nCharacter: %s",
                Integer.toString(intNum),
                Float.toString(floatNum),
                Double.toString(doubleNum),
                Long.toString(longNum),
                name,
                A
                )
            );
    }
}
