public class Laaner {


    private int laanerId;
    private String laanerNavn;
    private String mail;
    private int telefonNr;


    public  Laaner()
    {}

    public Laaner(int lId, String lNavn, String m, int tNr)
    {
        laanerId = lId;
        laanerNavn = lNavn;
        mail = m;
        telefonNr = tNr;
    }

    public int getLaanerId()
    {
        return laanerId;
    }
    public String getLaanerNavn()
    {
        return laanerNavn;
    }

    public String getMail()
   {
       return mail;
   }
    public  int getTelefonNr()
    {
        return telefonNr;
    }
}
