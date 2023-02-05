/*
Написать метод/функцию, который/которая на вход принимает массив городов. В качестве результата возвращает строку, где города разделены запятыми, а в конце стоит точка. 

Пример:

«Москва, Санкт-Петербург, Воронеж.»
*/
public class Task1 {

    public static void main(String[] args) {
        String[] cities = { "Москва", "Санкт-Петербург", "Воронеж" };
        System.out.println(citiesInRow(cities));
    }

    public static String citiesInRow(String[] cities) {
        String citiesString = "";
        for (int i = 0; i < cities.length; i++) {
            if (i == cities.length - 1) {
                citiesString += cities[i] + ".";
            } else {
                citiesString += cities[i] + ", ";
            }
        }
        return citiesString;
    }
}
