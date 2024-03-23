import java.util.*;
class InvalidageException extends Exception
{
    public InvalidageException(String msg)
    {
        super (msg);
    }
}
class UExcept
{
    public static void main(String args[])
    {
        try
        {
            int age;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your age:");
            age=sc.nextInt();
            if(age>=18)
            System.out.println("You are eligible for voting");
            else
            throw new InvalidageException("You are not eligible for voting");
            }
            catch(InvalidageException e)
            {
                System.out.println("My own error class"+e); 
            }
    }
}
