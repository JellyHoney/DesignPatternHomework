public class Client {
    public static void main(String[] args){
        Class obj=new Class();
        Student student1,student2,student3,student4;
        student1=new Student("1","张三",20);
        student2=new Student("2","李四",23);
        student3=new Student("3","王五",19);
        student4=new Student("4","赵六",22);
        obj.addStudent(student1);
        obj.addStudent(student2);
        obj.addStudent(student3);
        obj.addStudent(student4);
        obj.displayStudent();
    }
}
