public class Forfatter {

    private String forfatterNavn;
    private String forlag;
    private String nationalitet;
    private int foedeAar;
    private int doedeAar;



    public Forfatter()
    {}
    public Forfatter(String forfatterNavn, String forlag, String nationalitet, int foedeAar, int doedeAar)
    {
        this.forfatterNavn = forfatterNavn;
        this.forlag = forlag;
        this.nationalitet = nationalitet;
        this.foedeAar = foedeAar;
        this.doedeAar = doedeAar;

    }

    public String getForfatterNavn()
    {
        return forfatterNavn;
    }

    public String getForlag()
    {
        return forlag;
    }


}
