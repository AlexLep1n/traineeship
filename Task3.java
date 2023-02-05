/*
Написать метод/функцию, который/которая на вход принимает число (int), а на выходе выдает слово “компьютер” в падеже, соответствующем указанному количеству. Например, «25 компьютеров», «41 компьютер», «1048 компьютеров».
*/
public class Task3 {
    public static void main(String[] args) {
        System.out.println(caseOfTheWord(41));
    }

    public static String caseOfTheWord(int number) {
        String str = "";
        if (number % 10 == 1 || number == 1) {
            str = number + " компьютер";
        } else if (number % 10 > 1 && number % 10 < 5) {
            str = number + " компьютера";
        } else {
            str = number + " компьютеров";
        }
        return str;
    }
}
