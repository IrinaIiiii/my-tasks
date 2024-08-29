package task8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {
    private Map<Student, Map<Subject, Integer>> mapOfStudentsMarks = new HashMap<>();
    private Map<Subject, List<Student>> mapOfStudentsSubjects = new HashMap<>();

    public void addStudent(Student student, Map<Subject, Integer> map) {
        mapOfStudentsMarks.put(student, map);
    }

    public void addSubjectMarkToStudent(int idStudent, Subject subject, int mark) {
        for (var entry: mapOfStudentsMarks.entrySet()) {
            if(entry.getKey().getId()==idStudent) {
                entry.getValue().put(subject,mark);
            }
        }
    }

    public void deleteStudent(Student student) {
        mapOfStudentsMarks.remove(student);
        for (var entry: mapOfStudentsSubjects.entrySet()) {
            Iterator<Student> iterator = entry.getValue().iterator();
            while (iterator.hasNext()) {
                if (iterator.next().equals(student)) {
                    iterator.remove();
                }
            }
        }
    }

    public void printStudentsWithSubjectsMark() {
        for (var entry: mapOfStudentsMarks.entrySet()) {
            System.out.println("Студент: " + entry.getKey().getName());
            System.out.println("Предметы и оценки");
            for (var entry2: entry.getValue().entrySet()) {
                System.out.println(entry2.getKey().getName()+ " - " + entry2.getValue());
            }
        }
    }

    public void addSubjectOfStudents(Subject subject, List<Student> list) {
        mapOfStudentsSubjects.put(subject, list);
    }

    public void addStudentsOfSubject(int idSubject, Student student) {
        for (var entry: mapOfStudentsSubjects.entrySet()) {
            if (entry.getKey().getId()==idSubject){
                entry.getValue().add(student);
            }
        }
    }


}
