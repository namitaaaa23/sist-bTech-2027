package t4_hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingCustomObjects {

    public static void main(String[] args) {

        ArrayList<Student> students =
                        new ArrayList<>();

        students.add(
            new Student(
                    101,
                    "John",
                    75));

        students.add(
            new Student(
                    102,
                    "David",
                    92));

        students.add(
            new Student(
                    103,
                    "Emma",
                    85));

        Collections.sort(
                students,
                new Comparator<Student>() {

            @Override
            public int compare(
                    Student s1,
                    Student s2) {

                return s1.mark-s2.mark;
            }

        });

        System.out.println(
                "Sorted Students:");

        for(Student s:students)
            System.out.println(s);

    }

}

class Student {

    int id;
    String name;
    int mark;

    Student(int id,
            String name,
            int mark){

        this.id=id;
        this.name=name;
        this.mark=mark;
    }

    @Override
    public String toString() {

        return id
                +" "
                +name
                +" "
                +mark;
    }

}