import java.util.*;
class Student{
    Scanner sc=new Scanner(System.in);
    String name;
    int rollno;
    void getdetails(){
        System.out.println("Enter Your Name:");
        name=sc.next();
        System.out.println("Enter Your RollNo:");
        rollno=sc.nextInt();
    }
}
class Marks extends Student{
   int marks;
   void getmarks(){
       System.out.println("Enter the Marks");
       marks=sc.nextInt();
   }
}
class Result extends Marks{
    void display(){
        System.out.println("Roll No:"+rollno);
        System.out.println("Name:"+name);
        System.out.println("Marks:"+marks);
    }
}
public class Multilevel {
    public static void main(String args[]) {
        Result obj=new Result();
        obj.getdetails();
        obj.getmarks();
        obj.display();
    }
    
}
