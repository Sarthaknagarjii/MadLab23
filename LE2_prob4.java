class One
{
    One(int x)
    {
        System.out.println(x);
    }
}
class Two extends One
{
    public Two()
    {
        super(9);
    }
}
public class Main
{
    public static void main( String args[])
    {
        One o=new One(6);
        Two t=new Two();
    }
}