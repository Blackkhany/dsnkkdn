/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehical;

/**
 *
 * @author lenovo
 */
public class Vehical{
     void run(){
        System.out.println("vehical is tranfer for on eplace to other");
        
    }
}
   class bike extends Vehical{
        void run(){
           System.out.println("bike is faster then any other vehical");
       }
    
    public static void main(String[] args) {
        
        bike b=new bike();
        b.run();

               
    }
    
}
