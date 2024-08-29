package task7;

import task4.Library;

import java.util.*;

public class Main {
    private Map<User, List<Query>> map = new HashMap<>();



    public void addUser(User user, List<Query> list) {
        map.put(user,list);
    }

    public void addQuery(int idUser, Query query ) {
        for (var entry: map.entrySet()) {
            if (entry.getKey().getId()==idUser) {
                entry.getValue().add(query);
            }
        }
    }

    public void deleteUser(User user) {
        map.remove(user);
    }

    public void getUserQuery(int idUser) {
        for (var entry: map.entrySet()) {
            if (entry.getKey().getId()==idUser) {
                Comparator<Query> comparator = new Comparator<>() {
                    @Override
                    public int compare(Query o1,Query o2) {
                        return o1.getLocalDateTime().compareTo(o2.getLocalDateTime());
                    }
                };
                Collections.sort(entry.getValue(),comparator);
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

    }
}
