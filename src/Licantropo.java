public class Licantropo implements Umano, Mostro
{
    protected boolean umano;
    protected int forzaU;
    protected int forzaM;
    public Licantropo(boolean luna)
    {
        umano = !luna;
        if(!luna)
        {
            forzaU = 10;
            forzaM = 0;
        }
        else
        {
            forzaU = 0;
            forzaM = 15;
        }
    }
    public void azzanna()
    {
        if(!umano)
        {
            forzaM -= 2;
        }
    }
    public void combatti()
    {
        if(umano)
        {
            forzaU -= 3;
        }
    }
    public String forza()
    {
        return "forza rimanente del licantropo umano: " + forzaU + "\n" +
                "forza rimantente del licantropo mostro: " + forzaM;
    }
}