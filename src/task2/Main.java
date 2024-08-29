package task2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Иван", 18, "fhfjhfh");
        User user2 = new User("Иван", 19, "fhfjhfh");
        User user3 = new User("Петр", 28, "порпррп");
        User user4 = new User("Олег", 18, "ененен");
        User user5 = new User("Ольга", 16, "fhfjhfh");
        User user6 = new User("Ирина", 19, "укукук");
        User user7 = new User("Ева", 28, "ывдвддв");
        User user8 = new User("Николай", 38, "цщцщц");
        User user9 = new User("Дмитрий", 68, "йхйхйх");
        List<User> users = List.of(user1, user2, user3, user4, user5, user6, user7, user8, user9);

        Map<Integer, List<User>> map = groupUsers(users);
        for (Map.Entry<Integer, List<User>> entry: map.entrySet()) {
            System.out.println(entry.getKey()+ " - "+ entry.getValue());
        }
    }

    public static Map<Integer, List<User>> groupUsers(List<User> list) {
        Map<Integer, List<User>> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            int age = user.getAge();

            if (map.containsKey(age)) {
                List<User> listUsers = map.get(age);
                listUsers.add(user);

            } else {
                List<User> listUsers = new ArrayList<>();
                listUsers.add(user);
                map.put(age, listUsers);
            }
        }
        return map;
    }
}
