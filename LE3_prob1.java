abstract class Bharatvanshi
{
    void fighter()
         {
         System.out.println(" Bharatvanshi figter");
         }
         abstract void kind();
         abstract void obey();
         abstract void notorious();
}
class Pandavas extends Bharatvanshi
{
     void obey()
     {
        System.out.println("Pandavas are obedeient");
     }
     void kind()
     {
        System.out.println("Pandavas are kind");
     }
     void notorious()
     {
        System.out.println(" weren't notorious");
     }
}
class Kauravas extends Bharatvanshi
{
     void notorious()
     {
        System.out.println("notorious Kauravas");
     }
     void obey()
     {
        System.out.println("disobedient Kauravas");
     }
     void kind()
     {
        System.out.println(" not kind");
     }
}
class Bheem extends Pandavas
{
     void kind()
     {
        System.out.println("less kind");
     }
     void obey()
     {
        System.out.println("obedeient Bheem");
     }
}
class Arjun extends Pandavas
{
     void kind()
     {
        System.out.println("Arjun is kind");
     }
     void obey()
     {
        System.out.println("obedeient Arjun");
     }
}
class Duryodhan extends Kauravas
{
     void notorious()
     {
        System.out.println("Duryodhan was disobedient");
     }
     void obey()
     {
        System.out.println("disobedient Duryodhan");
     }
}
class Vikarn extends Pandavas
{
     void kind()
     {
        System.out.println("Vikarn was kind");
     }
     void obey()
     {
        System.out.println("obedeient Vikarn");
     }
}
public class Main
{
    public static void main(String[] args) 
    {
     Arjun a=new Arjun();
     a.fighter();
     a.obey();
     a.kind();
     
     Bheem b=new Bheem();
     b.fighter();
     b.obey();
     b.kind();
     
     Vikarn v=new Vikarn();
     v.fighter();
     v.obey();
     v.kind();
     
     Pandavas p=new Pandavas();
     p.kind();
     p.obey();
     
     Duryodhan d=new Duryodhan();
     d.notorious();
     d.fighter();
    }
}