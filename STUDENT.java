class STUDENT
{
    int id;
    String name;
    void display()
    {
        System.out.println(id+""+name);
    }
    public static void main(String args[]){
        STUDENT s1=new STUDENT();
        STUDENT s2=new STUDENT();
        s1.display();
        s2.display();
    }
}