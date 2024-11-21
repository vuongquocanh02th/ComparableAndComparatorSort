import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Phong",22,"Ha Noi");
        Student student1 = new Student("Phong Em",22,"Quang Tri");
        Student student2 = new Student("Phong Ba",21,"Hue");
        Student student3 = new Student("Phong Tu",20,"Quang Binh");
        List<Student> list = new ArrayList<Student>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list);
        for(Student s : list){
            System.out.println(s.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list, ageComparator);
        System.out.println("So sanh theo tuoi: ");
        for(Student s : list){
            System.out.println(s.toString());
        }
    }
}