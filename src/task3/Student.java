package task3;

public class Student {
    private String name;
    private int year;
    private String faculty;

    public Student(String name, int year, String faculty) {
        this.name = name;
        this.year = year;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}
