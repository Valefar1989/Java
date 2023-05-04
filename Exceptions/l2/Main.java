package lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        boolean i = true;

        while (i) {
            System.out.print("Введите число: ");
            try {
                float number = Float.parseFloat(reader.readLine());
                System.out.printf("Введенное число равно %f\n", number);
                i = false;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Неверный ввод. Введите дробное число!!!");
            }

        }
        task2();
        task4();
    }

    //    Если необходимо, исправьте данный код (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
    public static void task2() {
        try {
            int[] intArray = {0, 1, 3, 5, 1, 6, 7, 4, 2};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    //    Дан следующий код, исправьте его там, где требуется (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
    // Здесь нужно поменять последовательность catch. Сначала идёт catch (IndexOutOfBoundsException ex), затем catch (NullPointerException ex) и в конце catch (Throwable ex),
    // так как до этого всегда срабатывал catch (Throwable ex), и до остальных проверка просто не доходила.

    //    Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    //    Пользователю должно показаться сообщение, что пустые строки вводить нельзя
    public static void task4() {
        System.out.println("Введите текст");
        try {
            String result = reader.readLine();
            if (result.equals("")) {
                throw new RuntimeException("Нельзя вводить пустую строчку");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}