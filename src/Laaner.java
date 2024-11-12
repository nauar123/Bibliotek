public class Laaner extends Person{


    protected String adresse;
    protected String mail;
    protected CprNr cprnr;


    public  Laaner()
    {}

    public Laaner( String navn, String adresse, String mail, CprNr cprnr)
    {
        super(navn);
        this.adresse = adresse;
        this.mail = mail;
        this.cprnr = cprnr;

    }

    public String getAdresse()
    {
        return adresse;
    }

    public String getMail()
   {
       return mail;
   }

    public CprNr getCprnr()
    {
        return cprnr;
    }
}
