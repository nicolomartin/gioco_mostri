public class Main
{
    public static void main(String[] args)
    {
        Eroe e1 = new Eroe();
        Vampiro v1 = new Vampiro();
        Licantropo l1 = new Licantropo(true);
        Licantropo l2 = new Licantropo(false);

        e1.combatti();
        e1.combatti();
        e1.combatti();

        v1.azzanna();

        l1.azzanna();
        l1.azzanna();

        l2.combatti();
        l2.combatti();

        System.out.println(e1.forza());
        System.out.println(v1.forza());
        System.out.println(l1.forza());
        System.out.println(l2.forza());
    }
}