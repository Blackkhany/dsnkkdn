
import java.util.*;
class Account
{
 Scanner sc = new Scanner(System.in);
 int user_id;
 int password;
 void getDetails()
{
 System.out.println("Enter your user id:");
 user_id=sc.nextInt();
 System.out.println("Enter your password:");
 password = sc.nextInt();
 }
 void putDetails()
{
 System.out.println("User ID: " + user_id);
 System.out.println("Password: " + password);
 }
}
class saving extends Account
{
 Scanner sc = new Scanner(System.in);
 int s_account;
 int s_balance;
 void getSaving()
{
 System.out.println("Enter your s_account:");
 System.out.println("Enter your s_balance:");
 s_account =sc.nextInt();
 s_balance = sc.nextInt();
 }
 void putSaving()
{
 System.out.println("Saving account:" + s_account);
 System.out.println("Saving balance: " + s_balance);
 }
}

class current extends Account
{
 Scanner sc = new Scanner(System.in);
 int c_account;
 int c_balance;
 void getCurrent()
{
 System.out.println("Enter your c_account:");
 c_account=sc.nextInt();
 System.out.println("Enter your c_balance:");
 c_balance = sc.nextInt();
 }
 void putCurrent()
{
 System.out.println("current account:" + c_account);
 System.out.println("current balance: " + c_balance);
 } }
public class Hierarchial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account obj1=new Account();
 saving obj2=new saving();
 current obj3 =new current();
 obj1.getDetails();
 obj1.putDetails();
 obj2.getSaving();
 obj2.putSaving();
 obj3.getCurrent();
 obj3.putCurrent();
    }
    
}

