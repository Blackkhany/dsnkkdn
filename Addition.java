/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author lenovo
 */
public class Addition {
    public void sum(){
    System.out.println("No ADDITION");
}
    public void sum(int a , int b){
        System.out.println("addition of two number is"+(a+b));
        
    }
    public void sum( int x ,int y , int z){
        System.out.println("Addition of three number is"+(x+y+z));
    }
    public void sum(double a , double b){
        System.out.println("addition of two double number is"+(a+b));
    }
     
public static void main(String []args){
    Addition a= new Addition();
     a.sum();
     a.sum(20.98, 10.36);
     a.sum(20, 1002);
     a.sum(20, 25, 553);
}
   
}
