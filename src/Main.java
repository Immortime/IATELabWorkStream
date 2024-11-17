import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User(1, "Саша", "Никишкин", 23, "Россия"),
                new User(2, "Оля", "Лалаленд", 25, "Канада"),
                new User(3, "Aлина", "Начало", 20, "США"),
                new User(4, "Степан", "Интерстеллар", 45, "Новая Зеландия"),
                new User(5, "Маркус", "Гослинг", 6, "Казахстан")
        );

        UserManager userManager = new UserManager();

        System.out.println("Сортировка по lastName:");
        userManager.sortByLastName(users).forEach(System.out::println);

        System.out.println("Сортировка по age:");
        userManager.sortByAge(users).forEach(System.out::println);

        System.out.println("Проверка, что для всех возраст > 7:");
        System.out.println(userManager.sortByAgeAbove7(users));

        System.out.println("Средний возраст:");
        System.out.println(userManager.averageAge(users));

        System.out.println("Количество разных стран:");
        System.out.println(userManager.countDistinctCountries(users));

    }

}
