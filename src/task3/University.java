package task3;

import java.util.*;

public class University {
    public static class Pair {
        private String faculty;
        private int year;

        public Pair(String faculty, int year) {
            this.faculty = faculty;
            this.year = year;
        }

        public String getFaculty() {
            return faculty;
        }

        public int getYear() {
            return year;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return year == pair.year && faculty.equals(pair.faculty);
        }

        @Override
        public int hashCode() {
            return Objects.hash(faculty, year);
        }


    }

    private Map<Pair, List<Student>> map = new HashMap<>();

    public void addStudent(Student student) {
        Pair pair = new Pair(student.getFaculty(), student.getYear());

        if (map.containsKey(pair)) {
            List<Student> list = map.get(pair);
            list.add(student);
            map.put(pair, list);
        } else {
            List<Student> list = new ArrayList<>();
            list.add(student);
            map.put(pair, list);

        }

    }

    public void deleteStudent(String name, int year, String faculty) {
        Pair pair = new Pair(faculty, year);
        if (map.containsKey(pair)) {
            List<Student> list = map.get(pair);
            Iterator<Student> iterator = list.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().getName().equals(name)) {
                    System.out.println("Удаляем студента с именем:" + iterator.next().getName());
                    iterator.remove();
                }
            }

        }
    }

    public void printListStudent(int year, String faculty) {
        Pair pair = new Pair(faculty, year);
        if (map.containsKey(pair)) {
            List<Student> list = map.get(pair);
            System.out.println(pair.getFaculty() + pair.getYear());
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getName());
            }
        }
    }
}
