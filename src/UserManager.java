import java.util.*;
import java.util.stream.Collectors;

public class UserManager {

    public List<User> sortByLastName(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparing(User::getLastName))
                .collect(Collectors.toList());
    }

    public List<User> sortByAge(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList());
    }

    public boolean sortByAgeAbove7(List<User> users) {
        return users.stream()
                .allMatch(user -> user.getAge() > 7);
    }

    public OptionalDouble averageAge(List<User> users) {
        return users.stream()
                .mapToInt(User::getAge)
                .average();
    }

    public long countDistinctCountries(List<User> users) {
        return users.stream()
                .map(User::getCountry)
                .distinct()
                .count();
    }
}
