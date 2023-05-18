interface Testable 
{
    void learnCoding();
    void learnProgrammingLanguage();
    void contribute();
}
abstract class Test implements Testable 
{
    @Override public void learnCoding()
    {
        System.out.println("Make coding a habit");
    }
    @Override public void learnProgrammingLanguage()
    {
        System.out.println("Master all fundamentals of java with the help of tools like GDB");
    }
}
class AbsTest extends Test 
{
    @Override public void contribute()
    {
        System.out.println("Help others by contributing in GDB");
    }
}
public class Main 
{
    public static void main(String[] args)
    {
        AbsTest TestableTest = new AbsTest();
        TestableTest.learnCoding();
        TestableTest.learnProgrammingLanguage();
        TestableTest.contribute();
    }
}