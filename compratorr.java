import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

class Student {

    int age;
    String name;

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    // Corrected the constructor signature
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

public class compratorr {
    public static void main(String[] args) {

        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.age > s2.age)
                    return 1;
                else if (s1.age < s2.age)
                    return -1;
                else
                    return 0;
            }
        };

        // List<Integer> li = new ArrayList<>();
        // li.add(56);
        // li.add(465);
        // li.add(545);
        // li.add(56);
        // Collections.sort(li, com);
        // System.out.println(li);

        List<Student> students = new ArrayList<>();
        students.add(new Student(14, "sahil"));
        students.add(new Student(24, "sal"));
        students.add(new Student(17, "ahil"));
        students.add(new Student(19, "hil"));

        Collections.sort(students, com);
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
