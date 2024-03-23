 abstract class Person
{
  public abstract void display();
}
 class EmployeeA extends Person
 {
    int empno;
    String empname,addr;
    public EmployeeA(int empno,String empname,String addr)
    {
        this.empno=empno;
        this.empname=empname;
        this.addr=addr;
    }
    public void display()
    {
        System.out.println("Employee Details");
        System.out.println("Employee Id is"+empno);
        System.out.println("Employee Name is"+empname);
        System.out.println("Employee Address is"+addr);
    }
}
class Worker extends Person
{
    int hours;
    String name;
    public Worker(int hours,String name)
    {
        this.hours=hours;
        this.name=name;
    }
    public void display()
    {
        System.out.println("Worker Details:");
        System.out.println("Worker working hours is:"+hours);
        System.out.println("Worker name is:"+name);
    }
}
public class Abstract
{
    public static void main(String[] args)
    {
    EmployeeA e=new EmployeeA(1,"Priyanshu","Mumbai");
    e.display();
    Worker w= new Worker(10,"Priyanshu");
    w.display();
    }
}
