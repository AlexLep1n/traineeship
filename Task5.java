import java.util.ArrayList;
import java.util.List;

/*
Написать метод, который определяет, какие элементы присутствуют в двух экземплярах в каждом из массивов (= в двух и более, причем в каждом). На вход подаются два массива. На выходе массив с необходимыми совпадениями.

Пример:

[7, 17, 1, 9, 1, 17, 56, 56, 23], [56, 17, 17, 1, 23, 34, 23, 1, 8, 1]

На выходе [1, 17]
*/
public class Task5 {
    public static void main(String[] args) {
        int[] arr1 = { 7, 17, 1, 9, 1, 17, 56, 56, 23 };
        int[] arr2 = { 56, 17, 17, 1, 23, 34, 23, 1, 8, 1 };
        System.out.println(searchIdenticalNumbers(arr1, arr2));
    }

    public static List<Integer> searchIdenticalNumbers(int[] arr1, int[] arr2) {
        // Создаем экземпляр класса ArrayList и производим upcast до интерфейса
        // arrList1 также является массивом
        List<Integer> arrList1 = new ArrayList<>();
        // Добавляем в него данные из числового массива arr1
        for (int i : arr1) {
            arrList1.add(i);
        }
        // Сортируем массив данных типа int
        arrList1.sort(null);
        // Оставляем только повторяющиеся числа в массиве
        for (int i = 0; i < arrList1.size() - 1; i++) {
            if (arrList1.get(i) != arrList1.get(i + 1) && arrList1.get(i) != arrList1.get(i - 1)) {
                arrList1.remove(i);
                i--;
            }
        }
        // Производим те же действия, что и с массивом arrList1
        List<Integer> arrList2 = new ArrayList<>();
        for (int i : arr2) {
            arrList2.add(i);
        }
        arrList2.sort(null);
        for (int i = 0; i < arrList2.size() - 1; i++) {
            if (arrList2.get(i) != arrList2.get(i + 1) && arrList2.get(i) != arrList2.get(i - 1)) {
                arrList2.remove(i);
                i--;
            }
        }
        // Создает массив, который наш метод будет возвращать
        List<Integer> res = new ArrayList<>();
        int count = 0;
        // Проходимся циклом по двум входным массивам и добавляем в выходной
        // массив res числа, которые повторялись 2 и больше раз
        for (int i : arrList1) {
            for (int j : arrList2) {
                if (i == j) {
                    count++;
                    if (!res.contains(i) && count >= 2) {
                        res.add(i);
                        count = 0;
                    }
                } else {
                    count = 0;
                }
            }
        }
        return res;
    }
}
