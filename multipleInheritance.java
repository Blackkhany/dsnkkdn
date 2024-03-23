/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Degree
 */
import java.util.*;
interface Student{
    void getDetails();
}
interface Sports{
    void getSportsMarks();
}
class Result implements Student,Sports{
    Scanner sc = new Scanner(System.in);
    int id;
    String name;
    int marks;
    int sMarks;
    
    
    public void getDetails(){
        System.out.println("Enter your id:");
        id=sc.nextInt();
        System.out.println("Enter your name:");
        name=sc.next();
        System.out.println("Enter your marks:");
        marks=sc.nextInt();
    }
    
    public void getSportsMarks(){
        System.out.println("Enter your sports marks:");
        sMarks=sc.nextInt();
    }
    void display(){
        System.out.println("id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Marks:"+marks);
        System.out.println("sports marks:"+sMarks);
    }
}
public class multipleInheritance{
    public static void main(String args[]){
            Result obj=new Result();
            obj.getDetails();
            obj.getSportsMarks();
            obj.display();
                    }
}
        
        
        
        
      

