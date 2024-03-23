/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehical;

/**
 *
 * @author lenovo
 */
 class student {
     int rollno;
     String name;
     static String college="UOM";
     static void change(){
         college ="Lords";
     }
     student (int r ,String n){
         rollno=r;
         name=n;
     }
     void display(){
         System.out.println(rollno+" "+name+" "
                 +college);
         
     }
 }
     public class TEstStaticMEthod{

    public static void main(String args[]){
             student.change();
             student s1=new student(12,"soyam");
             student s2=new student(13,"swet");
             student s3=new student(14,"robin");
             s1.display();
             s2.display();
             s3.display();
         }
     }
     
    

