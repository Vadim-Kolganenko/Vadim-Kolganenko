import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // =========================================================================
        // ЧАСТИНА 1: Виведення інформації про ВСІ примітивні типи даних (Лекція 7)
        // =========================================================================
        System.out.println("=== ІНФОРМАЦІЯ ПРО ПРИМІТИВНІ ТИПИ ДАНИХ ===");

        // 1. Малі цілі числа (byte)
        System.out.println("Тип: byte");
        System.out.println("Розмір у байтах: " + Byte.BYTES); // Константи з Лекції 7
        System.out.println("Мінімальне значення: " + Byte.MIN_VALUE);
        System.out.println("Максимальне значення: " + Byte.MAX_VALUE);
        System.out.println("--------------------------------------------");

        // 2. Короткі цілі числа (short)
        System.out.println("Тип: short");
        System.out.println("Розмір у байтах: " + Short.BYTES);
        System.out.println("Мінімальне значення: " + Short.MIN_VALUE);
        System.out.println("Максимальне значення: " + Short.MAX_VALUE);
        System.out.println("--------------------------------------------");

        // 3. Стандартні цілі числа (int)
        System.out.println("Тип: int");
        System.out.println("Розмір у байтах: " + Integer.BYTES);
        System.out.println("Мінімальне значення: " + Integer.MIN_VALUE);
        System.out.println("Максимальне значення: " + Integer.MAX_VALUE);
        System.out.println("--------------------------------------------");

        // 4. Великі цілі числа (long)
        System.out.println("Тип: long");
        System.out.println("Розмір у байтах: " + Long.BYTES);
        System.out.println("Мінімальне значення: " + Long.MIN_VALUE);
        System.out.println("Максимальне значення: " + Long.MAX_VALUE);
        System.out.println("--------------------------------------------");

        // 5. Дробові числа з низькою точністю (float)
        System.out.println("Тип: float");
        System.out.println("Розмір у байтах: " + Float.BYTES);
        System.out.println("Мінімальне значення: " + Float.MIN_VALUE);
        System.out.println("Максимальне значення: " + Float.MAX_VALUE);
        System.out.println("--------------------------------------------");

        // 6. Дробові числа з високою точністю (double)
        System.out.println("Тип: double");
        System.out.println("Розмір у байтах: " + Double.BYTES);
        System.out.println("Мінімальне значення: " + Double.MIN_VALUE);
        System.out.println("Максимальне значення: " + Double.MAX_VALUE);
        System.out.println("--------------------------------------------");

        // 7. Символьний тип (char)
        System.out.println("Тип: char");
        System.out.println("Розмір у байтах: " + Character.BYTES);
        System.out.println("Мінімальне числове значення: " + (int) Character.MIN_VALUE);
        System.out.println("Максимальне числове значення: " + (int) Character.MAX_VALUE);
        System.out.println("--------------------------------------------");

        // 8. Логічний тип (boolean)
        System.out.println("Тип: boolean");
        System.out.println("Допустимі значення: " + Boolean.TRUE + " або " + Boolean.FALSE);
        System.out.println("============================================\n");


        // =========================================================================
        // ЧАСТИНА 2: Читання з терміналу та конвертація (Лекція 6 та 7)
        // =========================================================================
        // Ініціалізація сканера для читання стандартного потоку System.in (Лекція 6)
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== ЗЧИТУВАННЯ ТА ПЕРЕТВОРЕННЯ ДАНИХ КОРИСТУВАЧА ===");

        // 1. Конвертація у byte
        System.out.print("Введіть число типу byte (від -128 до 127): ");
        String byteStr = scanner.nextLine(); // Зчитуємо саме цілий рядок через nextLine()
        byte parsedByte = Byte.parseByte(byteStr); // Перетворення методом обгортки
        System.out.println("Збережено значення типу byte: " + parsedByte);
        System.out.println();

        // 2. Конвертація у short
        System.out.print("Введіть число типу short (від -32768 до 32767): ");
        String shortStr = scanner.nextLine();
        short parsedShort = Short.parseShort(shortStr);
        System.out.println("Збережено значення типу short: " + parsedShort);
        System.out.println();

        // 3. Конвертація у int
        System.out.print("Введіть ціле число типу int: ");
        String intStr = scanner.nextLine();
        int parsedInt = Integer.parseInt(intStr);
        System.out.println("Збережено значення типу int: " + parsedInt);
        System.out.println();

        // 4. Конвертація у long
        System.out.print("Введіть велике ціле число типу long: ");
        String longStr = scanner.nextLine();
        long parsedLong = Long.parseLong(longStr);
        System.out.println("Збережено значення типу long: " + parsedLong);
        System.out.println();

        // 5. Конвертація у float
        System.out.print("Введіть дробове число типу float (наприклад, 1.5): ");
        String floatStr = scanner.nextLine();
        float parsedFloat = Float.parseFloat(floatStr);
        System.out.println("Збережено значення типу float: " + parsedFloat);
        System.out.println();

        // 6. Конвертація у double
        System.out.print("Введіть точне дробове число типу double (наприклад, 3.1415): ");
        String doubleStr = scanner.nextLine();
        double parsedDouble = Double.parseDouble(doubleStr);
        System.out.println("Збережено значення типу double: " + parsedDouble);
        System.out.println();

        // 7. Конвертація у boolean
        System.out.print("Введіть логічне значення boolean (true або false): ");
        String booleanStr = scanner.nextLine();
        boolean parsedBoolean = Boolean.parseBoolean(booleanStr);
        System.out.println("Збережено значення типу boolean: " + parsedBoolean);
        System.out.println();

        // 8. Отримання char з рядка
        System.out.print("Введіть будь-який один символ (тип char): ");
        String charStr = scanner.nextLine();
        // Рядок не має методу parseChar, тому беремо перший символ згідно з правилами роботи зі String
        char parsedChar = charStr.charAt(0);
        System.out.println("Збережено символ типу char: '" + parsedChar + "'");

        // Обов'язкове вивільнення ресурсів, як вчили на Лекції 6
        scanner.close();
        System.out.println("\n============================================");
        System.out.println("Програму успішно завершено. Усі ресурси звільнено.");
    }
}
