import java.util.*;
public class Class {
    private ArrayList<Student> students=new ArrayList<Student>();
    void addStudent(Student student){
        students.add(student);
    }
    void displayStudent(){
        Comparator comp=new MyComparator();
        Collections.sort(students,comp);
        Iterator i=students.iterator();
        while(i.hasNext()){
            Student student=(Student)i.next();
            System.out.println("学号:"+student.getId()+"姓名:"+student.getName()+"年龄:"+student.getAge());
        }
    }
}
