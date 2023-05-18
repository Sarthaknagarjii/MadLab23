import java.util.*;
class Mother
{
    int x=10;
    void show()
    {
      System.out.println(x);  
    }
}
class Child extends Mother{
    int y=20;
}
class Main
{
    public static void main(String args[])
    {
        Mother m=new Mother();
        m.show();
        Child ch=new Child();
        ch.show();
        Mother m1=new Child();
        m1.show();
    }
}