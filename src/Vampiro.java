public class Vampiro implements Mostro
{
    protected int forza;
    public Vampiro()
    {
        forza = 15;
    }
    public void azzanna()
    {
        forza -= 2;
    }
    public String forza()
    {
        return "forza rimanente del vampiro: " + forza;
    }
}