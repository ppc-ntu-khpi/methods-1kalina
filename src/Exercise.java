//package domain;

public class Exercise {

    public static String Calculate(int number) {
        // Робимо перевірку створюючи новий клас при не виконаній умові
        // Новий клас потрібний для try-catch (Мабуть не ефективний спосіб?)
        if (number < 100000 || number > 999999) {
            throw new IllegalArgumentException("Число має бути шестизначним (100000-999999)");
        }
        String binary = Integer.toBinaryString(number);
        String octal = Integer.toOctalString(number);
        String hex = Integer.toHexString(number);
        // Збираємо усі дані в один рядок щоб не створювати 3 змінних
        return String.join(", ", binary, octal, hex);
    }
}
