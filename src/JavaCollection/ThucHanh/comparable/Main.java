package JavaCollection.ThucHanh.comparable;

import sun.plugin.javascript.navig.Link;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Hưng", 24, "ND");
        Student student1 = new Student("Tuệ", 26, "HT");
        Student student2 = new Student("Kiên", 22, "HN");
        Student student3 = new Student("Huy", 29, "HN");

        List<Student> studentLink = new ArrayList<Student>();
        studentLink.add(student);
        studentLink.add(student1);
        studentLink.add(student2);
        studentLink.add(student3);

        Collections.sort(studentLink);
        for (Student st : studentLink){
            System.out.println(st.toString());
        }

        AgeComperator ageComperator = new AgeComperator();
        Collections.sort(studentLink,ageComperator);
        System.out.println("So sánh theo tuổi");
        for(Student st : studentLink){
            System.out.println(st.toString());
        }
    }
}
