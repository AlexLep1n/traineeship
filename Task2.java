/*
Написать метод/функцию, который/которая на вход принимает число (float), а на выходе получает число, округленное до пятерок.

Пример:

27 => 25, 27.8 => 30, 41.7 => 40.
*/
public class Task2 {
    public static void main(String[] args) {
        float num = 22f;
        System.out.println(roundToFive(num));
    }

    public static int roundToFive(float number) {
        int res;
        float numAfterDiv = number / 10;
        float decimalNum = numAfterDiv % 1 * 10;
        if (decimalNum >= 5) {
            if (Math.round(decimalNum) - 5 <= 2) {
                res = (int) Math.ceil(numAfterDiv) * 10 - 5;
            } else {
                res = (int) Math.ceil(numAfterDiv) * 10;
            }
        } else {
            if (5 - Math.round(decimalNum) < 3) {
                res = (int) Math.ceil(numAfterDiv) * 10 - 5;
            } else {
                res = (int) Math.floor(numAfterDiv) * 10;
            }
        }
        return res;
    }

}
