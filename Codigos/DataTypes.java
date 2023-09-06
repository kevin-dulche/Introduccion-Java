public class DataTypes {
    public static void main(String[] args) {
        // Datos enteros
        byte b = 0; // -128 a 127, 1 byte
        short s = 0; // -32768 a 32767, 2 bytes
        int i = 0; // -2147483648 a 2147483647, 4 bytes
        long l = 0; // -9223372036854775808 a 9223372036854775807, 8 bytes
        l = 12345678901L;

        // Datos decimales
        float f = 0; // 1.40129846432481707e-45 a 3.402823466338528860e+38, 4 bytes
        f = 123.456F;
        double d = 123.456; // 4.94065645841246544e-324d a 1.79769313486231570e+308d, 4 bytes

        char c = 'a'; // Unicode, comilla simple, 2 bytes
        boolean bool = true; // true o false, 2 bytes

        var salary = 1000;
        // pension 3%
        var pension = salary * 0.03; // double
        var totalSalary = salary - pension;
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Kevin Dulche";
        System.out.println("EMPLOYEE: " + employeeName + " SALARY: " + totalSalary);
    }
}