/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;
class except
{
public static void main(String args[])
{
try
{
int a,b;
float c;
int x[]={10,20,30};
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers:");
a=sc.nextInt();
b=sc.nextInt();
c=(int)a/b;
System.out.println("Division of a and b = " +c );
System.out.println("Element of array = " + x[6]);
}
catch(ArrayIndexOutOfBoundsException e1)
{
System.out.println("Array Index Out of range");
}
catch(ArithmeticException e2)
{
    System.out.println("You can't divide a number by zero");
}
catch(Exception e)
{
System.out.println("Error");
}
}


}