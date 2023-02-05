/*
Написать метод/функцию, который/которая на вход принимает целое число, а на выходе возвращает то, является ли число простым (не имеет делителей кроме 1 и самого себя).
*/
public class Task4 {
    public static void main(String[] args) {
        System.out.println(isPrime(3));
    }

    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
