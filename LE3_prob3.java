abstract class Ducks
{
    void Swim()
    {
        System.out.println("can Swim");
    }
    abstract void Fly();
    abstract void Speak();
}
class RD extends Ducks
{
     void Fly()
     {
        System.out.println("RD can't Fly");
     }
     void Speak()
     {
        System.out.println("RD squeaks");
     }
}
class WD extends Ducks
{
     void Fly()
     {
        System.out.println("WD can't Fly");
     }
     void Speak()
     {
        System.out.println("WD mute");
     }
}
class RHD extends Ducks
{
     void Fly()
     {
        System.out.println("RHD can Fly");
     }
     void Speak()
     {
        System.out.println("RHD quack");
     }
}
class LD extends Ducks
{
     void Fly()
     {
        System.out.println(" LD can Fly");
     }
     void Speak()
     {
        System.out.println("LD quack");
     }
}
public class Main
{
    public static void main(String[] args) 
    {
        RD R=new RD();
        R.Fly();
        R.Speak();
        R.Swim();
        
        LD L=new LD();
        L.Fly();
        L.Speak();
        L.Swim();
        
        RHD RH=new RHD();
        RH.Fly();
        RH.Speak();
        RH.Swim();
        
        WD W=new WD();
        W.Fly();
        W.Speak();
        W.Swim();
    }
}