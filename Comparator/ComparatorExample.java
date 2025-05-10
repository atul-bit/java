//Comparator is an interface in java.util package which is used to write custom sorting 
// logic based on different objects.

package Comparator;
import java.util.*;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String print() {
        return name + " is " + age + " years old";
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 18));
        students.add(new Student("Charlie", 20));

        System.out.println("Before Sorting : ");

        for (Student stud : students) {
            System.out.println(stud.print());
        }

        Collections.sort(students, new Comparator<Student>() {
            public int compare (Student s1, Student s2) {
                return s1.age > s2.age ? 1 : -1;
            }
        });

        System.out.println("After Sorting : ");

        for (Student stud : students) {
            System.out.println(stud.print());
        }
    }
    
}
