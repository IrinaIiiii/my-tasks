package UrokSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Storage {
    Set<User> set = new HashSet<>();


    public void add(String name, String email, int age) {
        User user = new User(name, email, age);
        if (set.contains(user)) {
            return;
        } else {
            set.add(user);
        }
    }

    public void delete(User user){
        if (!set.remove(user)) {
            System.out.println("Нет такого пользователя");
        }
    }

    public void update(User user, String newemail) {
        String oldEmail = user.getEmail();
        if (set.contains(user)) {

            user.setEmail(newemail);
        } else {
            System.out.println("Такого пользователя не существует");
        }
        if (set.contains(user)) {
            System.out.println("Такой email уже существует");

        } else {
            set.add(user);
            user.setEmail(oldEmail);
            set.remove(user);
        }
    }

}