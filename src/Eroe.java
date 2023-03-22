public class Eroe implements Umano
{
    protected int forza;
    public Eroe()
    {
        forza = 10;
    }
    public void combatti()
    {
        forza -= 3;
    }
    public String forza()
    {
        return "forza rimanente dell'eroe: " + forza;
    }
}