import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("ПРИМІТИВНІ ТИПИ ДАНИХ JAVA");
        System.out.println();

        System.out.println("byte");
        System.out.println("Розмір: " + Byte.BYTES + " байт");
        System.out.println("Мінімальне значення: " + Byte.MIN_VALUE);
        System.out.println("Максимальне значення: " + Byte.MAX_VALUE);
        System.out.println();

        System.out.println("short");
        System.out.println("Розмір: " + Short.BYTES + " байт");
        System.out.println("Мінімальне значення: " + Short.MIN_VALUE);
        System.out.println("Максимальне значення: " + Short.MAX_VALUE);
        System.out.println();

        System.out.println("int");
        System.out.println("Розмір: " + Integer.BYTES + " байт");
        System.out.println("Мінімальне значення: " + Integer.MIN_VALUE);
        System.out.println("Максимальне значення: " + Integer.MAX_VALUE);
        System.out.println();

        System.out.println("long");
        System.out.println("Розмір: " + Long.BYTES + " байт");
        System.out.println("Мінімальне значення: " + Long.MIN_VALUE);
        System.out.println("Максимальне значення: " + Long.MAX_VALUE);
        System.out.println();

        System.out.println("float");
        System.out.println("Розмір: " + Float.BYTES + " байт");
        System.out.println("Мінімальне значення: " + Float.MIN_VALUE);
        System.out.println("Максимальне значення: " + Float.MAX_VALUE);
        System.out.println();

        System.out.println("double");
        System.out.println("Розмір: " + Double.BYTES + " байт");
        System.out.println("Мінімальне значення: " + Double.MIN_VALUE);
        System.out.println("Максимальне значення: " + Double.MAX_VALUE);
        System.out.println();

        System.out.println("char");
        System.out.println("Розмір: " + Character.BYTES + " байт");
        System.out.println("Мінімальне значення: " + (int) Character.MIN_VALUE);
        System.out.println("Максимальне значення: " + (int) Character.MAX_VALUE);
        System.out.println();

        System.out.println("boolean");
        System.out.println("Значення: true або false");
        System.out.println();


        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть byte: ");
        String byteText = scanner.nextLine();
        byte byteValue = Byte.parseByte(byteText);
        System.out.println("Ви ввели: " + byteValue);

        System.out.print("Введіть short: ");
        String shortText = scanner.nextLine();
        short shortValue = Short.parseShort(shortText);
        System.out.println("Ви ввели: " + shortValue);

        System.out.print("Введіть int: ");
        String intText = scanner.nextLine();
        int intValue = Integer.parseInt(intText);
        System.out.println("Ви ввели: " + intValue);

        System.out.print("Введіть long: ");
        String longText = scanner.nextLine();
        long longValue = Long.parseLong(longText);
        System.out.println("Ви ввели: " + longValue);

        System.out.print("Введіть float: ");
        String floatText = scanner.nextLine();
        float floatValue = Float.parseFloat(floatText);
        System.out.println("Ви ввели: " + floatValue);

        System.out.print("Введіть double: ");
        String doubleText = scanner.nextLine();
        double doubleValue = Double.parseDouble(doubleText);
        System.out.println("Ви ввели: " + doubleValue);

        System.out.print("Введіть char: ");
        String charText = scanner.nextLine();
        char charValue = charText.charAt(0);
        System.out.println("Ви ввели: " + charValue);

        System.out.print("Введіть boolean (true/false): ");
        String booleanText = scanner.nextLine();
        boolean booleanValue = Boolean.parseBoolean(booleanText);
        System.out.println("Ви ввели: " + booleanValue);

        scanner.close();
    }
}
