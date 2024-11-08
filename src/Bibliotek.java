public class Bibliotek {

    private String bibliotekNavn;
    private String adresse;
    private String kommune;

    public Bibliotek()
    {}
    public Bibliotek(String bNavn,String ad, String k)
    {
        bibliotekNavn = bNavn;
        adresse = ad;
        kommune = k;
    }

    public String getBibliotekNavn()
    {
        return bibliotekNavn;
    }
    public String getAdresse()
    {
        return adresse;
    }
    public String getKommune()
    {
        return kommune;
    }
}
