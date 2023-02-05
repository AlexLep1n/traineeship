/*
Написать метод, который в консоль выводит таблицу умножения. На вход метод получает число, до которого выводит таблицу умножения. В консоли должна появиться таблица. Например, если на вход пришло число 5, то получим: (таблицу умножения).

Важно:

В последней строке между числами ровно по одному пробелу должно выводиться.
В каждом столбце числа должны быть выровнены по правому краю.
*/
public class Task6 {
    public static void main(String[] args) {
        multTable(5);
    }

    public static void multTable(int number) {
        System.out.printf("   ");
        for (int i = 1; i <= number; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.println();
        for (int i = 1; i <= number; i++) {
            System.out.printf("%2d", i);
            for (int j = 1; j <= number; j++) {
                System.out.printf(" %2d", (j * i));
            }
            System.out.println();
        }
    }
}
