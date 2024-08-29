package task2;

public class User {
    private String name;
    private int age;
    private String placeWork;

    public User(String name, int age, String placeWork) {
        this.name = name;
        this.age = age;
        this.placeWork = placeWork;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPlaceWork() {
        return placeWork;
    }

    public void setPlaceWork(String placeWork) {
        this.placeWork = placeWork;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", placeWork='" + placeWork + '\'' +
                '}';
    }
}
